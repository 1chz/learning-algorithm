# acm craft
import heapq
from collections import defaultdict

def solve(precede_list, build_next, construct_time, target):
    # 조건 없이 바로 만들 수 있는 건물, precede_list의 각 idx 값이 0 인 경우
    queue = [(construct_time[i], i) for i in range(1, len(precede_list)) if precede_list[i] == 0]
    # 시간순서로 정렬
    heapq.heapify(queue)

    while queue:
        finish_time, building = heapq.heappop(queue)
        
        if building == target:
            return finish_time

        for next_build in build_next[building]:
            precede_list[next_build] -= 1

            if precede_list[next_build] == 0:
                heapq.heappush(queue, (finish_time + construct_time[next_build], next_build))


T = int(input())
for i in range(T):
    N, K = map(int, input().split())
    precede_list = [0 for _ in range(N+1)]
    build_next = defaultdict(list)
    construct_time = list(map(int, input().split()))
    construct_time.insert(0, 0)

    for _ in range(K):
        a, b = map(int, input().split())
        precede_list[b] += 1
        build_next[a].append(b)

    target = int(input())
    print(solve(precede_list, build_next, construct_time, target))
