import sys
import collections
import heapq

V, E = map(int, input().split())
# V = 정점, E = 간선
start = int(input())
graph = collections.defaultdict(list)
INF = sys.maxsize

for _ in range(E):
    u, v, w = map(int, input().split())
    graph[u].append((v, w))
#그래프를 입력을 해야하므로 그래프에 입력받기
# v -> 노드, w -> 거리

def dijkstra(graph, start):
    arr_distance = [INF]*(V+1)
    arr_distance[start] = 0
    Q = []
    heapq.heappush(Q, (0, start))
    # distances = 거리배열
    #우선순위 큐에 0과 시작 노드를 입력
    while Q:
        dist, now_node = heapq.heappop(Q)
        # 처음의 경우 dist = 0, node = start(1)이 들어감
        if arr_distance[now_node] < dist:
            continue
            #distances[key] = value dictionary
        for v, w in graph[now_node]:

            update = dist + w
            if update < arr_distance[v]:
                arr_distance[v] = update
                heapq.heappush(Q, (update, v))

    for i in range(1, V+1):
        if i == start:
            print('0')
        elif arr_distance[i] == INF:
            print('INF')
        else:
            print(arr_distance[i])

dijkstra(graph, start)

#feat(Jeongmu-Jo): [BOJ, 1753] 최단경로
