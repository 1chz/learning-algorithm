import heapq

def solution(scoville, K):
    answer = 0
    heap =[]
    for i in scoville:
        heapq.heappush(heap,i)

    while heap[0] < K:
        if heap[0] < K and len(heap) == 1:
            return -1
        heapq.heappush(heap,heapq.heappop(heap) + heapq.heappop(heap)*2)
        answer += 1

    return answer


print(solution([1, 2, 3, 9, 10, 12], 7))
