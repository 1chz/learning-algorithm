import sys

# sys.stdin = open('input.txt', 'r')

K, N = map(int, input().split())

'''
1. 잘린 랜선의 최소 길이 = 다 더한뒤 11로 나누기
2. while 문을 돌면서 각각의 랜선을 잘린 랜선의 최대길이로 나누기
3. 자른 길이를 더하는데, 모두 더한값이 11보다 작을 경우 랜선의 최대 길이 -1
4. 만약 자른 길이의 갯수 >= 11이라면 print(자른 길이의 갯수) 하고 break
'''
lan_lines = [int(input()) for i in range(K)]

max_length = sum(lan_lines) // N

while True:
    count = 0
    for i in range(K):
        count += lan_lines[i] // max_length
    if count >= N:
        print(max_length)
        break
    else:
        max_length -= 1
