case = int(input())

for i in range(case):
    print("Case #", end="")
    print(i+1, end="")
    print(": ", end="")
    x, y = map(int, input().strip().split())
    print(x, end=" ")
    print("+", end=" ")
    print(y, end=" ")
    print("=", end=" ")
    print(x+y)