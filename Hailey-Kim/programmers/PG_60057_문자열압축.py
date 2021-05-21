'''
String Compression
https://programmers.co.kr/learn/courses/30/lessons/60057
- Compress the given string s
and return the length of the shortest version of those

03/08/21
'''
def solution(s):
    answer = len(s) #initialize - the worst case
    
    for step in range(1, len(s)): # unit to divide the string
        result = '' # compressed version at each step
        count = 1 # count to keep track of the repeated s
        i = 0 # index of letters in string
        prev = s[i:i+step]

        while i + step < len(s):
            i += step
            if prev == s[i:i+step]:
                count += 1
            else:
                result += str(count) + prev if count >= 2 else prev
                count = 1
                prev = s[i:i+step]
        result += str(count) + prev if count >=2 else prev #deal with the remaining string
        
        answer = min(answer, len(result))
    
    return answer       
