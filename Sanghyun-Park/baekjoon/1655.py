import sys
import heapq
N = int(sys.stdin.readline().replace("\n", ""))
min_heap = []
max_heap = []
for _ in range(N):
    now = int(sys.stdin.readline().replace("\n", ""))

    if len(min_heap) == len(max_heap):
        heapq.heappush(max_heap, (-1 * now, now))
    else:
        heapq.heappush(min_heap, (now, now))

    if min_heap and min_heap[0][1] < max_heap[0][1]:
        temp_a = heapq.heappop(min_heap)[1]
        temp_b = heapq.heappop(max_heap)[1]
        heapq.heappush(min_heap, (temp_b, temp_b))
        heapq.heappush(max_heap, (-1*temp_a, temp_a))
    print(max_heap[0][1])