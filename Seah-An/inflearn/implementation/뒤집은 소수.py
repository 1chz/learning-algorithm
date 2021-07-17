import sys

# sys.stdin = open("in2.txt", "rt")

N = int(input())
arr = list(map(int,input().split()))

answer = []
# 뒤집는 함수
def reverse(x):
    x = str(x)
    back = []
    for i in range(len(x)-1,-1,-1):
        back.append(x[i])

    number = 0
    for i in range(len(back)):
        number += (10 ** (len(back) - int(i)- 1)) * int(back[i])

    return number


# 소수인지 확인하는 함수수
def isPrime(x):
    flag = True
    for i in range(2,x):
        if x % i == 0:
            flag = False
    if x == 1:
        flag = False
    return flag


for i in range(len(arr)):
    x = reverse(arr[i])
    result = isPrime(x)
    if result == True:
        print(x, end=' ')
