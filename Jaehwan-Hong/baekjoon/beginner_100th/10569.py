# 다면체
t = int(input())
s = []
for i in range(t):
    v, e = map(int, input().split())
    s.append(2 + e - v)
print(*s, sep='\n')