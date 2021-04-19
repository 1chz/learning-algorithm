from collections import defaultdict
import heapq

def solve():
    queue = [(constrcut_time[i], i) for i in range(1, len(precede_list)) if precede_list[i] == 0]
    heapq.heapify(queue)

    while queue:
        finish_time, building = heapq.heappop(queue)
        if building == target:
            return finish_time
        
        for next_building in build_next[building]:
            precede_list[next_building] -= 1
            if precede_list[next_building] == 0:
                heapq.heappush(queue, (finish_time + constrcut_time[next_building], next_building))

T = int(input())
for i in range(T):
    N, K = map(int, input().split())
    precede_list = [0] * (N+1)
    build_next = defaultdict(list)
    constrcut_time = list(map(int, input().split()))
    constrcut_time.insert(0, 0)

    for i in range(K):
        a, b = map(int, input().split())
        precede_list[b] += 1
        build_next[a].append(b)
    
    target = int(input())
    print(solve())