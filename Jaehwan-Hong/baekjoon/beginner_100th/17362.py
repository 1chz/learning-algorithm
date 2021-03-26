# 수학은 체육과목 입니다2
n = int(input())
if(n % 8 == 1):
    print(1)
elif(n % 8 in [0, 2]):
    print(2)
elif(n % 8 in [3, 7]):
    print(3)
elif(n % 8 in [4, 6]):
    print(4)
else:
    print(5)