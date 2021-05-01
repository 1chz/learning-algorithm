n = int(input())
s = list(map(int, input().split()))
num = 0
s.sort()
for i in range(n):
    for j in range(i + 1):
        num += s[j]
print(num)

#feat(Jeongmu-Jo): [BOJ, 11399] ATM