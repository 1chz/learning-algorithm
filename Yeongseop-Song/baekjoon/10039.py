# boj 10039 평균 점수 b4
# noj.am/10039

score = [int(input()) for _ in range(5)]
res = [40 if i < 40 else i for i in score]
print(sum(res) // 5)
