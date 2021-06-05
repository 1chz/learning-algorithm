'''
10부제
https://www.acmicpc.net/problem/10797
'''

from sys import stdin
n = int(stdin.readline())
inputs = list(map(int, stdin.readline().split()))

count = 0
for x in inputs:
    if x == n:
        count += 1
        
        
print(count)