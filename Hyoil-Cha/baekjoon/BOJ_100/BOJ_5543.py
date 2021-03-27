import sys

"""
    feat(Hyoil-Cha): [BOJ, 5543] 상근날드

    https://www.acmicpc.net/problem/5543
"""

def solution() :

    burger_list = []
    beverage_list = []
    
    for i in range(3) :
        while True:
            burger = int(input())
            if burger >= 100 and burger <= 2000:
                break
        burger_list.append(burger)

    for _ in range(2) :
        while True:
            beverage = int(input())
            if beverage >= 100 and beverage <= 2000:
                break
        beverage_list.append(beverage)
    
    print(min(burger_list) + min(beverage_list) - 50)

solution()
                