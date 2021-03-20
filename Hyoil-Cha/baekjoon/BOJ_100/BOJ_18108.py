import sys

"""
    feat(Hyoil-Cha): [BOJ, 18108] 1998년생인 내가 태국에서는 2541년생?

    https://www.acmicpc.net/problem/18108
"""

def solution() :
    while True :
        num = int(sys.stdin.readline().strip())

        if 1000 <= num & num <= 3000 :
            print(num - 543)
            break

solution()
    