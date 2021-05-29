# import sys
# input = sys.stdin.readline()
from collections import deque

# 입력부

# 전체 사람 수 n
n = int(input())
# 촌수를 계산해야하는 서로 다른 두 사람의 번호
a, b = map(int,input().split())
# 부모 자식들간의 관계의 개수
m = int(input())

G = [[]for _ in range(n+1)]


#부모 자식간의 관계를 나타내는 두 번호 x, y
# x는 y의 부모 번호
for _ in range(m):
    x, y= map(int,input().split())
    G[x].append(y)
    G[y].append(x)

def bfs(v):
    q= deque()
    visited = [0 for _ in range(n + 1)]
    q.append(v)
    visited[v] = 1
    chon = 0
    while q:
        chon += 1
        for _ in range(len(q)):
            v = q.popleft()
            if v == b:
                return chon -1
            for e in G[v]:
                if not visited[e]:
                    visited[e] = 1
                    q.append(e)
    return -1

print(bfs(a))
