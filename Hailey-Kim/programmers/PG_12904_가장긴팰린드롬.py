'''
Palindrome


Given the string,
return the length of the longest palindrome
that appears in that string

programmers.co.kr/learn/courses/30/lessons/12904
03/15/21
'''

def isPalindrome(s):
    if s == s[::-1]:
        return True
    else:
        return False

def solution(s):
    answer = 1

    for checkRange in range(len(s), 1, -1):
        for startIndex in range(len(s)):
            if startIndex + checkRange > len(s):
                break
            if isPalindrome(s[startIndex:startIndex+checkRange]):
                answer = max(answer, checkRange)

    return answer
