# 최소 스패닝 트리
def find(x):
    if p[x] == x:
        return x
    else:
        parent = find(p[x])
        p[x] = parent
        return parent

def union(x, y):
    x = find(x)
    y = find(y)
    if x != y:
        p[y] = x

v, e = map(int, input().split())
graph = []
p = [i for i in range(v+1)]
for _ in range(e):
    a, b, c = map(int, input().split())
    graph.append([c,a,b])

graph.sort(key=lambda x:x[0])
cnt = answer = 0
for i in range(e):
    dis = graph[i][0]
    start = graph[i][1]
    end = graph[i][2]
    if find(start) != find(end):
        union(start, end)
        answer += dis
        cnt += 1
    if cnt == v-1:
        break
print(answer)