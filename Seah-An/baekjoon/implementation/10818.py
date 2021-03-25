import sys

input = sys.stdin.readline

N = int(input())

lists = list(map(int, input().split()))

# for문을 돌리지 않고 파이썬 내장함수로 값을 출력하는 방법
# min - 반복 가능한 객체의 가장 작은 요소 값을 리턴한다.
# max - 반복 가능한 객체의 가장 큰 요소 값을 리턴한다.
# print('{} {}'.format(min(lists),max(lists)))

# 반복문을 활용해서 최대값, 최소값 구하는 방법
max, min = lists[0], lists[0]
for num in lists:
    if num > max:
        max = num
    if num < min:
        min = num
print(min, max)
