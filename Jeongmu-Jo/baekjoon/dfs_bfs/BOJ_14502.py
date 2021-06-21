from collections import deque
from itertools import permutations
import copy
n, m = map(int, input().split())

maps = [list(map(int, input().split())) for i in range(n)]
q = deque()
zero_lst = []
copy_zero_virus = [[0 for i in range(m)] for j in range(n)]
virus = copy_zero_virus[:]
dx, dy = [0, -1, 0, 1], [-1, 0 , 1, 0]
max_val = 0

def bfs(x,y):
    if maps[x][y] == 2:
        q.append((x,y))
        virus[x][y] = 2
        while q:
            x, y = q.popleft()
            for w in range(4):
                nx, ny = x + dx[w], y + dy[w]
                if nx < 0 or nx >= n or ny < 0 or ny >= m:
                    continue
                if maps[nx][ny] == 0 and virus[nx][ny] == 0:
                    virus[nx][ny] = 2
                    q.append((nx, ny))

def safe():
    global virus
    total = n*m
    for i in range(n):
        for j in range(m):
            if virus[i][j] == 2 or maps[i][j] == 1:
                total -= 1
    return total

for i in range(n):
    for j in range(m):
        if maps[i][j] == 0:
            zero_lst.append((i)*10+j)

permu = permutations(zero_lst, 3)

def ans():
    global max_val
    global virus
    for i in list(permu):
    #for i in range(1):
        #i = list(permu)[0]
        for j in range(3):
            x = i[j]//10
            y = i[j] % 10
            maps[x][y] = 1
        #벽이 3개이므로 벽 3개의 조합
        for k in range(n):
            for o in range(m):
                bfs(k, o)
        max_val = max(max_val, safe())
        #아래 디버깅 코드
        if max_val == 100000:
            print('maps ---------------------')
            for i in maps:
                print(i)
            print('virus ---------------------')
            for i in virus:
                print(i)
        virus = [[0 for _ in range(m)] for i in range(n)]
        for r in range(3):
            x = i[r]//10
            y = i[r] % 10
            maps[x][y] = 0

ans()
print(max_val)
#벽의 위치를 모두 리스트에 넣고 나오는 조합의 수, 벽 3개를 세운뒤 bfs cnt가 최소인것
#feat(Jeongmu-Jo): [BOJ, 14502] 연구소
