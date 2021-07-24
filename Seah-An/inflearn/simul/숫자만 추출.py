import sys

# sys.stdin = open('input.txt', 'r')

words = input()

numbers = []
divisor = 0

for i in range(len(words)):
    # 숫자인지 확인하는 함수
    if words[i].isdigit():
        numbers.append(words[i])

number = 0
for i in range(len(numbers) - 1, -1, -1):
    number += (10 ** (len(numbers) - i - 1)) * int(numbers[i])

cnt = 0
for i in range(1,number+1):
    if number % i ==0:
        cnt+=1

print(number)
print(cnt)
