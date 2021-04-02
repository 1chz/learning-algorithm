# boj 13866 팀 나누기 b4
# noj.am/13866

lv = list(map(int, input().split()))
lv.sort()
print(abs((lv[0] + lv[3]) - (lv[1] + lv[2])))
