'''
Lyrics Search
Given words and queries with '?' meaning any of single alphabetical letters,
return the array indicating how many times each query matches words

programmers.co.kr/learn/courses/30/lessons/60060

03/09/21
'''

from bisect import bisect_left, bisect_right


def count_by_range(a, left_value, right_value):
    right_index = bisect_right(a, right_value)
    left_index = bisect_left(a, left_value)
    
    return right_index - left_index
    
def solution(words, queries):
    answer = []
    # 단어 길이 별 배열 초기화
    data = [[] for _ in range(10001)] # 각 가사 단어 길이는 1이상 10000이하
    reverse = [[] for _ in range(10001)]
    
    # 단어 넣어주기
    for word in words:
    	data[len(word)].append(word)
        reverse[len(word)].append(word[::-1])
        
    # 각 배열 정렬
    for i in range(10001):
    	data[i].sort()
        reverse[i].sort()
        
    # 본격적으로 찾기
    for q in queries:
    	if q[0] != '?':
        	res = count_by_range(data[len(q)], q.replace('?','a'), q.replace('?','z'))
        else:
        	res = count_by_range(reverse[len(q)], q[::-1].replace('?','a'), q[::-1].replace('?','z'))
        answer.append(res)
        
    return answer
