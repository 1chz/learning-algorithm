# times[i] = (출발 노드, 도착 노드, time)
# n 개를 다 방문하는데 드는 최소의 시간 (shortest path problem: BFS)
# source 부터 연결노드들을 하나씩 방문해 나감 (이미 방문한 노드는 방문하지 않아야 함. unique)
# 더이상 방문할 수 있는 노드가 없는데(if queue is empty), 방문하지 않은 노드가 남아있다면 실패. -1 리턴
# 방문에 드는 시간은 heapq 에 저장해서 빼서 쓰고, 비교해서 버리거나 채택한다. heapq 를 이용하는 이유는, 현재 노드로부터 가장 가까운 길부터 처리해나가기 위해서
# time: O((E + V)*log V) (heapq 로 빼서 쓰기 떄문), space: O(V + E)

# Runtime: 484 ms, faster than 52.76% of Python3
# Memory Usage: 16.3 MB, less than 30.22% of Python3
from heapq import heappush, heappop
from collections import defaultdict


class Solution:
    def source_node_map(self, times: List[List[int]]) -> map:
        source_node_map = defaultdict(list)
        for i in times:
            source_node_map[i[0]].append([i[1], i[2]])
        return source_node_map

    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        visited, time_heap_q, candidate_q = {}, [], [(0, k)]
        source_node_map = self.source_node_map(times)

        if not source_node_map[k]:
            return -1

        while candidate_q:
            time, node = heappop(candidate_q)
            if node in visited.keys():
                continue
            for next_node, next_node_time in source_node_map[node]:
                heappush(candidate_q, (time + next_node_time, next_node))
            visited.update({node: time})

        if len(visited.keys()) != n:
            return -1

        return max(visited.values())