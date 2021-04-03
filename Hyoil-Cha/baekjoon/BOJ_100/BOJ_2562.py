import sys
from collections import defaultdict
from operator import itemgetter

"""
    feat(Hyoil-Cha): [BOJ, 2562] 최댓값

    https://www.acmicpc.net/problem/2562
"""

def solution() :
    output_dict = defaultdict(int)

    for i in range(9) :
        while True:
            curr = int(input())
            if curr < 100:
                break

        output_dict[i + 1] = curr

    res = max(output_dict.items(), key= itemgetter(1))
    print(res[1])
    print(res[0])

solution()



