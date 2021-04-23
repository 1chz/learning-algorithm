# boj 15873 공백 없는 A+B b4
# noj.am/15873

AB = list(map(int, input()))
if len(AB) == 2:
    print(sum(AB))
elif len(AB) == 3 and AB[1] == 0:
    print(AB[0] * 10 + AB[2])
elif len(AB) == 3 and AB[2] == 0:
    print(AB[1] * 10 + AB[0])
elif len(AB) == 4:
    print((AB[0] + AB[2]) * 10)
