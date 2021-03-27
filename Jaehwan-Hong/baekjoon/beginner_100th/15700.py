# 타일 채우기
n, m = map(int, input().split())

max = max(n, m)
min = min(n, m)

# 둘다 짝수일 때
if(n % 2 == 0 and m % 2 == 0):
    print(max * (min // 2))
# n이 짝수일 때
if(n % 2 == 0 and m % 2 == 1):
    print(n // 2 * m)
# m이 짝수일 때
if(n % 2 == 1 and m % 2 == 0):
    print(n * (m // 2))
# 둘다 홀수일 때
if(n % 2 == 1 and m % 2 == 1):
    print(max * (min // 2) + max // 2)