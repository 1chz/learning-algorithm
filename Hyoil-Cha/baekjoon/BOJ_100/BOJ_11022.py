import sys

"""
    feat(Hyoil-Cha): [BOJ, 11022] A+B - 8

    https://www.acmicpc.net/problem/11022
"""

def solution() :
    num = int(input())

    for i in range(num):
        
        while True:
            A, B = map(int, input().split())

            if 0 < A and B < 10 :
                break

        print(f"Case #{i+1}: {A} + {B} = {A + B}")

solution()