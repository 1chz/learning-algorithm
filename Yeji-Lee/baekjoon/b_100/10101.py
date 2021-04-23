# 삼각형 외우기
a = int(input())
b = int(input())
c = int(input())

if(a + b + c == 180):
    if(a == b == c == 60):
        print("Equilateral")
    elif(a == b or b == c or c == a):
        print("Isosceles")
    elif(a != b != c):
        print("Scalene")
else:
    print("Error")