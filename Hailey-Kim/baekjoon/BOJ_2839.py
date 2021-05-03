'''
설탕배달
https://www.acmicpc.net/submit/2839/27696321
'''

n = int(input())
count = 0

while True:
	if n % 5 == 0:
		count += n // 5
	elif n < 0:
		count = -1
		break
	else:
		count += 1
		n -= 3
print(count)