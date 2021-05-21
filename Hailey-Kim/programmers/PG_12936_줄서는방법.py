'''
Ways to Line Up

Given the number of people to line up (n),
find the k-th way of lining up!


- programmers.co.kr/learn/courses/30/lessons/12936

03/16/21
'''

import math

def solution(n, k):
    nums = [x for x in range(1, n+1)]
    answer = []

    while n > 0:
        n -= 1
        q, r = divmod(k, math.factorial(n))
        if r == 0:
            q -= 1

        curr = nums[q]
        answer.append(curr)
        nums.remove(curr)
        k = r
    return answer