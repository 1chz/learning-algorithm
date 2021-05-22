'''
Changes
https://www.acmicpc.net/problem/5585
'''

n = int(input())
n = 1000 - n
count = 0

while True:
    if n >= 500:
        count += n // 500
        n = n % 500
    elif n >= 100:
        count += n // 100
        n = n % 100
    elif n >= 50:
        count += n // 50
        n = n % 50
    elif n >= 10:
        count += n // 10
        n = n % 10
    elif n >= 5:
        count += n // 5
        n = n % 5
    else:
        count += n
        break
    print(count, n)
print(count)