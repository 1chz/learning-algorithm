import sys
import heapq
import collections

N = int(input())
M = int(input())
graph = [[] for i in range(N+1)]
INF = 100000000
arr_distance = [INF]*(N+1)

for _ in range(M):
    u, v, w = map(int, input().split())
    # u : 시작 도시, v : 도착 도시, w : 버스비용
    graph[u].append((v, w))

start_city, end_city = map(int, input().split())

def dijksta(graph, start):
    Q = []
    arr_distance[start] = 0
    heapq.heappush(Q, (0, start))

    while Q:
        current_distance, current_node = heapq.heappop(Q)
        # 0, 'A'
        if arr_distance[current_node] < current_distance:
            continue
        for adj, weight in graph[current_node]:
            # 'A"의 인접 노드들간의 거리와 인접 노드이름(adj)
            distance = current_distance + weight
            #distance -> 'A'부터 해당 노드까지의 거리
            if distance < arr_distance[adj]:
            # 거리배열 안의 값 (초기 INF)보다 값이 작으면 배열 업데이트
                arr_distance[adj] = distance
                heapq.heappush(Q, (distance, adj))
                # ex) B까지의 거리와 B를 업데이트

dijksta(graph, start_city)
print(arr_distance[end_city])

#feat(Jeongmu-Jo): [BOJ, 1916] 최소비용 구하기
