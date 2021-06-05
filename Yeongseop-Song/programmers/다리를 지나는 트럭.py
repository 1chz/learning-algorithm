# programmers 다리를 지나는 트럭 lv2
# https://programmers.co.kr/learn/courses/30/lessons/42583

from collections import deque

def solution(bridge_length, weight, truck_weights):
    dq = deque()
    cnt = 0

    for truck in truck_weights:
        while True:
            if len(dq) == bridge_length: # 다리의 길이와 큐의 길이가 같으면 pop
                dq.popleft()
            elif truck <= weight - sum(dq): # 다리무게 - 큐에 들어가 있는 트럭 무게의 합보다 현재 트럭이 가벼우면 큐에 삽입
                dq.append(truck)
                cnt += 1
                break
            else: # 아닐 경우 무게 0짜리 삽입
                dq.append(0)
                cnt += 1

    return cnt + bridge_length


if __name__ == "__main__":
    bridge_length1, weight1, truck_weights1 = 2, 10, [7,4,5,6] # 8
    bridge_length2, weight2, truck_weights2 = 100, 100, [10] # 101
    bridge_length3, weight3, truck_weights3 = 100, 100, [10,10,10,10,10,10,10,10,10,10] # 110
    print(solution(bridge_length1, weight1, truck_weights1))
    print(solution(bridge_length2, weight2, truck_weights2))
    print(solution(bridge_length3, weight3, truck_weights3))
