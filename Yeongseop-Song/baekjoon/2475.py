# boj 2475 검증수 b5
# noj.am/2475

print(sum(list(map((lambda x: x ** 2), map(int, input().split())))) % 10)
