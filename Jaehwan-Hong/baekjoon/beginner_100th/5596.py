# 시험 점수
min_score = list(map(int, input().split()))
man_score = list(map(int, input().split()))

s1 = sum(min_score)
s2 = sum(man_score)

if(s1 >= s2):
    print(s1)
else:
    print(s2)
