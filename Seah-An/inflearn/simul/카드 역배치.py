import sys

# sys.stdin = open('input.txt', 'r')

arr = [i for i in range(0, 21)]

for i in range(10):
    ai, bi = map(int, input().split())
    pocket = []
    for j in range(ai, bi + 1):
        pocket.append(arr[j])
    num = len(pocket) -1
    for k in range(ai,bi+1):
        arr[k] = pocket[num]
        num -= 1
print(*arr[1:])