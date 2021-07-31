import sys

sys.stdin = open('input.txt', 'r')

N, M = map(int, input().split())
lists = list(map(int, input().split()))

lists.sort()

lt = 0
rt = N - 1

while lt <= rt:
    mid = (lt + rt) // 2
    if lists[mid] == M:
        print(mid + 1)
        break
    elif lists[mid] > M:
        rt = mid - 1
    elif lists[mid] < M:
        lt = mid + 1
