from collections import Counter

def tow_str(string):
    result = []
    for i in range(len(string)-1):
        if string[i].isalpha() and string[i+1].isalpha():
            result.append(string[i]+string[i+1])
    return result

def solution(str1, str2):
    answer = 0
    str1 = str1.lower()
    str2 = str2.lower()
    
    if str1 == str2:
        return 65536
    
    str1_lst, str2_lst = tow_str(str1), tow_str(str2)
    
    print(str1_lst, str2_lst)
    
    count_1, count_2 = Counter(str1_lst), Counter(str2_lst)
    
    intersection = count_1&count_2
    union = count_1|count_2
    
    print(intersection, union)
    
    intersection = sum(list(intersection.values()))
    union = sum(list(union.values()))
    
    answer = int(intersection / union * 65536)
    return answer

#문자열 문제
#feat(Jeongmu-Jo): [카카오, 2018블라인드] 뉴스클러스터링
