import sys

# sys.stdin = open('input.txt','rt')

N = int(input())
list1 = list(map(int, input().split()))

M = int(input())
list2 = list(map(int,input().split()))

for i in range(len(list2)):
    list1.append(list2[i])

list1.sort()

print(*list1)