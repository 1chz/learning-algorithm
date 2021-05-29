import sys
from collections import deque

c = int(sys.stdin.readline())
pair = int(sys.stdin.readline())

adj = [[] for _ in range(c)]
visited = [0 for _ in range(c)]

for i in range(pair):
    x, y = map(int, sys.stdin.readline().split(" "))
    adj[x-1].append(y-1)
    adj[y-1].append(x-1)

queue = deque()
queue.append(0)
visited[0] = 1
count = 0


while queue:
    v = queue.popleft()
    count += 1

    for each in adj[v]:
        if visited[each] == 0:
            queue.append(each)
            visited[each] = 1
print(count-1)



