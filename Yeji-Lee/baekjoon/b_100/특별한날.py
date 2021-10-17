# https://www.acmicpc.net/problem/10768

m = int(input())
d = int(input())
if m < 2:
    print("Before")
elif m == 2:
    if d == 18:
        print("Special")
    elif d > 18:
        print("After")
    else:
        print("Before")
else:
    print("After")