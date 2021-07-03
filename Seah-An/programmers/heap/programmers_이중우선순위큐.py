# https://programmers.co.kr/learn/courses/30/lessons/42628

import heapq

def solution(operations):
    answer = []

    heap = []

    for i in operations:
        # 명령어
        command = i[0]
        num = int(i[2:])

        if command == 'I':
            heapq.heappush(heap,num)
            heap.sort()
        elif command == 'D':
            if len(heap) == 0:
                pass
            # 최대값 삭제
            elif num == 1:
                heap.sort()
                del heap[-1]
            # 최소값 삭제
            elif num == -1:
                heapq.heappop(heap)

    if len(heap) == 0:
        answer = [0,0]
    else:
        answer.append(heap[-1])
        answer.append(heap[0])
    return answer

print(solution(["I 16","D 1"]))
print(solution(["I 7","I 5","I -5","D -1"]))
print(solution(["I 16","I -5643", "D -1","D 1","I 123","D -1"]))
print(solution(["I 4", "I -1", "I 6", "I 3"]))
