'''
Pop Balloons

Between two adjacent balloons, you can pop the one with a bigger number.
For the entire round of popping balloons,
you are allowed to pop the balloon with a smaller number only once.

Given a list of balloons with numbers on them,
return the number of balloons which can remain at last!


programers.co.kr/learn/courses/30/lessons/68646

03/19/21
'''

def solution(a):
    answer = 0
    n = len(a)
    if n <= 2:
        return n
    leftMin = a[0]
    rightMin = a[-1]
    for i in range(1, n-1):
        if leftMin > a[i]:
            answer += 1
            leftMin = a[i]
        if rightMin > a[n-1-i]:
            answer += 1
            rightMin = a[n-1-i]

    answer += 2 - 1 if leftMin == rightMin else 2

    return answer
