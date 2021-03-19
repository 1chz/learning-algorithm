# boj 5554 심부름 가는 길 b5
# noj.am/5554

time = [int(input()) for _ in range(4)]
ans = [sum(time) // 60, sum(time) % 60]
print(*ans, sep="\n")
