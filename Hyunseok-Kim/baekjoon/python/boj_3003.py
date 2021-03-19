# https://www.acmicpc.net/problem/3003

data = list(map(int, input().split()))

chess = [1, 1, 2, 2, 2, 8]

print(chess[0]-data[0], chess[1]-data[1], chess[2]-data[2], chess[3]-data[3], chess[4]-data[4], chess[5]-data[5])