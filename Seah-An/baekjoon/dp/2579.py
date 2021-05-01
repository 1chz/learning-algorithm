import sys

input = sys.stdin.readline

N = int(input())
stairs = [0] * 300
answer = [0] * 300
for i in range(N):
    stairs[i] = int(input())

answer[0] = stairs[0]
answer[1] = stairs[0] + stairs[1]
answer[2] = max(stairs[2]+stairs[0], stairs[2] + stairs[1])
for i in range(3,N):
    answer[i] = max(stairs[i]+answer[i-2], stairs[i]+stairs[i-1]+answer[i-3])
print(answer[N-1])