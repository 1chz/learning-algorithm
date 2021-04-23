# boj 10101 삼각형 외우기 b4
# noj.am/10101

angle = [int(input()) for _ in range(3)]
res = ""
if angle[0] == 60 and angle[1] == 60 and angle[2] == 60:
    res = "Equilateral"
elif sum(angle) == 180:
    if angle[0] == angle[1] or angle[1] == angle[2] or angle[0] == angle[2]:
        res = "Isosceles"
    else:
        res = "Scalene"
else:
    res = "Error"

print(res)
