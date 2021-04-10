# boj 2588 곱셈 b4
# noj.am/2588

int1, int2 = input(), input()
res = []
res.append(int(int1) * int(int2[2]))
res.append(int(int1) * int(int2[1]))
res.append(int(int1) * int(int2[0]))
res.append(int(int1) * int(int2))
print(*res, sep="\n")
