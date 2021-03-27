# 파티가 끝나고 난 뒤
l, p = map(int, input().split())
n = list(map(int, input().split()))
for i in range(5):
    print(n[i] - l * p, end=' ')