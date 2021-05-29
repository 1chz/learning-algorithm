# boj 2845 파티가 끝나고 난 뒤 b5
# noj.am/2845

P = (lambda x, y: x * y)(*map(int, input().split()))
print(*map(lambda x: x - P, list(map(int, input().split()))))
