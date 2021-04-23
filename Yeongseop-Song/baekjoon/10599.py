# boj 10599 페르시아의 왕들 b3
# noj.am/10599

while True:
    tc = list(map(int, input().split()))
    tc.sort()
    if tc.count(0) == 4:
        break
    print(tc[2] - tc[1], tc[3] - tc[0], sep=" ")
