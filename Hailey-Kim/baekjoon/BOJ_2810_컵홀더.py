'''
컵홀더
https://www.acmicpc.net/problem/2810
'''

n = int(input())
layout = input()
count = layout.count('LL')

if count < 2:
    print(len(layout))

else:
    print(len(layout)-count+1)