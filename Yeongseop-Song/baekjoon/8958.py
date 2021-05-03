# boj 8958 OX퀴즈 b2
# noj.am/8958

for _ in range(int(input())):
    data = input()
    cnt = 0
    res = 0
    for ox in data:
        if ox == "O":
            cnt += 1
            res += cnt
        else:
            cnt = 0
    print(res)
