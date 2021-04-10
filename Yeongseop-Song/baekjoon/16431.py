# boj 16431 베시와 데이지 b4
# noj.am/16431

Br, Bc = map(int, input().split())
Dr, Dc = map(int, input().split())
Jr, Jc = map(int, input().split())

daisy = abs(Dr - Jr) + abs(Dc - Jc)
tmp1 = abs(Br - Jr)
tmp2 = abs(Bc - Jc)

if tmp1 > tmp2:
    bessie = tmp2 + (tmp1 - tmp2)
elif tmp1 < tmp2:
    bessie = tmp1 + (tmp2 - tmp1)
else:
    bessie = tmp1


if bessie > daisy:
    print("daisy")
elif bessie < daisy:
    print("bessie")
else:
    print("tie")
