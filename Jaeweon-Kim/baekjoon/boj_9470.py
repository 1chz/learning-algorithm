# Strahler

from collections import deque

def sol():
    q = deque()
    for i in range(1, m+1):
        if indegree[i] == 0:
            count[i] = [1, 1]
            q.append(i)
            
    while q:
        temp = q.popleft()
        if count[temp][1] >= 2:
            order[temp] = count[temp][0] + 1
        else:
            order[temp] = count[temp][0]

        for node in graph[temp]:
            indegree[node] -= 1
            if count[node][0] == order[temp]:
                count[node][1] += 1
            elif count[node][0] < order[temp]:
                count[node] = [order[temp], 1]
            
            if indegree[node] == 0:
                q.append(node)

    print(k, end=' ')
    print(order[m])
        

t = int(input())
for i in range(t):
    k, m, p = map(int, input().split())
    graph = [[] for _ in range(m+1)]
    indegree = [0] * (m + 1)
    for i in range(p):
        a, b = map(int, input().split())
        graph[a].append(b)
        indegree[b] += 1

    count = [[0, 0]] * (m + 1)
    order = [0] * (m+1)
    sol()