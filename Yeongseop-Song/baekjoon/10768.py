# boj 10768 특별한 날 b4
# noj.am/10768

inp = [int(input()) for _ in range(2)]
if inp[0] == 2 and inp[1] == 18:
    print("Special")
elif inp[0] < 2 or (inp[0] == 2 and inp[1] < 18):
    print("Before")
else:
    print("After")
