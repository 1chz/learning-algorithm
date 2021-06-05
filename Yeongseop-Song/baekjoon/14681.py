# boj 14681 사분면 고르기 b4
# noj.am/14681

x = int(input())
y = int(input())
res = 0

if x > 0 and y > 0:
    res = 1
elif x > 0 and y < 0:
    res = 4
elif x < 0 and y > 0:
    res = 2
else:
    res = 3

print(res)
