'''
2 x n Tiling

Given n x 2 floor, return the number of ways to cover it with 2 x 1 blocks
programmers.co.kr/learn/courses/30/lessons/12900

03/19/21
'''


def solution(n):
    nums = [0, 1, 2]

    for i in range(3, n+1):
        newNum = (nums[-1] + nums[-2]) % 10000000007
        nums.append(newNum)

    return nums[-1]