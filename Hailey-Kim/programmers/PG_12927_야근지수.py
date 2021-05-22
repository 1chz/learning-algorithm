'''
Working Late

Overtime index is calculated by the sum of square of each remaining job's hours.
Number of hours each job takes are given in a list.
Given n hours to work, return the overtime index after all.

programmers.co.kr/learn/courses/30/lessons/12927

03/19/21
'''

import heapq


def solution(n, works):
    answer = 0

    works = [-x for x in works]
    heapq.heapify(works)

    while n > 0:
        curr = heapq.heappop(works)
        if curr == 0:
            break
        heapq.heappush(works, curr + 1)
        n -= 1

    for x in works:
        answer += x ** 2
    return answer
