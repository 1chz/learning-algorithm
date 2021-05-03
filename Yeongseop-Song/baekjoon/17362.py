# boj 17362 수학은 체육과목 입니다 2 b4
# noj.am/17362

N = int(input())
res = N % 8
if 0 < res <= 5:
    print(res)
elif res == 6:
    print(4)
elif res == 7:
    print(3)
elif res == 0:
    print(2)
