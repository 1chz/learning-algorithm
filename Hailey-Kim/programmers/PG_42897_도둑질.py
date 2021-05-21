'''
Thievery

Houses are organized in a cirular layout
and the thieve can only break into houses not next to each other.
Find the largest sum of money the theive can steal from this town
provided the list of amounts of money each house has.


programmers.co.kr/learn/courses/30/lessons/42897
03/12/21
'''

def solution(money):
    # 첫 번째 집 터는 경우
    dp1 = [0]*len(money)
    i = 0
    while i < len(money):
        dp1[i] = max(dp1[i-2], dp1[i-3]) + money[i]
        i += 1
    dp1[-1] -= money[0]

    # 첫 번째 집 안 터는 경우
    dp2 = [0] * len(money)
    j = 1
    while j < len(money):
        dp2[j] = max(dp2[j-2], dp2[j-3]) + money[j]
        j += 1

    answer = max(dp1[-3], dp1[-2], dp1[-1], dp2[-2], dp2[-1])
    return answer