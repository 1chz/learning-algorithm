import sys

"""
    feat(Hyoil-Cha): [BOJ, 14681] 사분면 고르기

    https://www.acmicpc.net/problem/14681
"""

def solution() :

    while True:
        x = int(input())
        if -1000 <= x and x <= 1000 and x != 0 :
            break
    
    while True:
        y = int(input())
        if -1000 <= y and y <= 1000 and y != 0 :
            break
    
    if x > 0 and y > 0 :
        print(1)
    elif x < 0 and y >0 :
        print(2)
    elif x < 0 and y < 0 :
        print(3)
    else:
        print(4)

solution()

