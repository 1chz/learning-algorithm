import sys

"""
    feat(Hyoil-Cha): [BOJ, 10817] 세수

    https://www.acmicpc.net/problem/10817
"""

def solution() :

    output_list = list(map(int, input().split()))

    output_list.sort()
    print(output_list[-2])

solution()