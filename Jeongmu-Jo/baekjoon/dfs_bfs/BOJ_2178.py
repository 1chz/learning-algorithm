from collections import deque

q = deque()
n, m = map(int, input().split())

dx, dy = [0, -1, 0, 1], [-1, 0, 1, 0]
maze = [list(map(int, input())) for _ in range(n)]
cnt = 1
visited = [[0 for i in range(m)] for _ in range(n)]
map = [[0 for i in range(m)] for _ in range(n)]
def bfs(i, j):
    global cnt
    visited[i][j] = 1
    q.append((i,j))
    while q:
        i, j = q.popleft()
        if i == n-1 and j == m-1:
            print(visited[i][j])
            break
        for w in range(4):
            ii, jj = i + dx[w], j + dy[w]
            
            if ii < 0 or ii >= n or jj < 0 or jj >= m:
                continue
            if maze[ii][jj] == 1 and visited[ii][jj] == 0:
                q.append((ii, jj))
                visited[ii][jj] = visited[i][j] +1

bfs(0,0)
#feat(Jeongmu-Jo): [BOJ, 2178] 미로 탐색 
