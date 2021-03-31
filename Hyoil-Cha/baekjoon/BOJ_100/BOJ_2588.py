import sys

"""
    feat(Hyoil-Cha): [BOJ, 2588] 곱셈

    https://www.acmicpc.net/problem/2588
"""

def solution() :

    num_list = []

    for _ in range(2) :
        while True:
            num = int(input())

            if 99 < num and num < 1000 :
                num_list.append(num)
                break
    to_solve_ints = list(map(int, str(num_list[1])))

    results = [res * num_list[0] for res in to_solve_ints]
    last_result = results[-1] + results[-2] * 10 + results[-3] * 100

    print(results[-1])
    print(results[-2])
    print(results[-3])
    print(last_result)

solution()


