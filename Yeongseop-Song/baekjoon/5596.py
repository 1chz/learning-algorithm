# boj 5596 시험 점수 b4
# noj.am/5596

S = sum(list(map(int, input().split())))
T = sum(list(map(int, input().split())))
print(S) if S >= T else print(T)
