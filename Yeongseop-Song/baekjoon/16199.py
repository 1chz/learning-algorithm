# boj 16199 나이 계산하기 b4
# noj.am/16199

y, m, d = map(int, input().split())
dy, dm, dd = map(int, input().split())

tmpM = "0%s" % str(m) if len(str(m)) == 1 else str(m)
tmpD = "0%s" % str(d) if len(str(d)) == 1 else str(d)
tmpDm = "0%s" % str(dm) if len(str(dm)) == 1 else str(dm)
tmpDd = "0%s" % str(dd) if len(str(dd)) == 1 else str(dd)
forManTmp = int(tmpM + tmpD)
forManTmpd = int(tmpDm + tmpDd)

if dy - y == 0:
    man = 0
else:
    if forManTmpd - forManTmp >= 0:
        man = dy - y
    else:
        man = dy - y - 1
se = 1 + dy - y
yeon = dy - y
print(man)
print(se)
print(yeon)
