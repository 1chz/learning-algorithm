# https://www.acmicpc.net/problem/16204

n, m, k = map(int, input().split())

# 카드가 n개 중에 m개는 o 나머지는 x
# k개 o, n-k개는 x 했을 때 최대

result = k if m > k else m
result += n-k if n-m > n-k else n-m

print(result)