# boj 2675 문자열 반복 b2
# noj.am/2675

T = int(input())

for _ in range(T):
    R, S = input().split()
    for word in S:
        for i in range(int(R)):
            print(word, end="")
    print()
