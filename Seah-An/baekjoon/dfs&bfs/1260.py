import sys
input = sys.stdin.readline

def dfs(V):
    print(V, end=' ')
    visited[V] = True
    for i in range(1,N+1):
        if visited[i] == False and graph[V][i] == 1:
            dfs(i)
def bfs(V):
    queue = []
    queue.append(V)
    visited[V] = False
    while(queue):
        v = queue[0]
        print(v, end=' ')
        del queue[0]
        for i in range(1,N+1):
            if graph[v][i] == 1 and visited[i] == True:
                queue.append(i)
                visited[i] = False




N, M, V = map(int,input().split())

graph = [[0] * (N+1) for i in range(N+1)]
visited = [False for i in range(N+1)]
for _ in range(M):
    a, b = map(int, input().split())
    graph[a][b] = 1
    graph[b][a] = 1

dfs(V)
print('')
bfs(V)