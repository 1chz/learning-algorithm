# boj 2920 음계 b2
# noj.am/2920

data = list(map(int, input().split()))
asc = [*range(1, 9)]
desc = [*range(8, 0, -1)]

if data == asc:
    print("ascending")
elif data == desc:
    print("descending")
else:
    print("mixed")
