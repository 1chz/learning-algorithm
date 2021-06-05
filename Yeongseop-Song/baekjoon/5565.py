
# boj 5565 영수증 b3
# noj.am/5565

total = int(input())
books9 = [int(input()) for _ in range(9)]
print(total - sum(books9))
