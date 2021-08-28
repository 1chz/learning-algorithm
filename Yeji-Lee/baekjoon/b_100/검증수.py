# https://www.acmicpc.net/problem/2475

arr = list(map(int, input().split()))
a = 0
for i in range(5):
	a += arr[i] * arr[i]
print(a % 10)

