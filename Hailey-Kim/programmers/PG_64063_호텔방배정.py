"""
호텔 방 배정
https://programmers.co.kr/learn/courses/30/lessons/64063
06/21/2021
"""
# brute-force -> fails efficiency test

# def solution(k, room_number):
#     answer = []
    
#     availableRoom = [-1] + [True for _ in range(k)]    
    
#     for i, x in enumerate(room_number):
#         if availableRoom[x]:
#             answer.append(x)
#             availableRoom[x] = False
#         else:
#             minAvailable= getNextAvailableRoom(x, availableRoom)
#             answer.append(minAvailable)
#             availableRoom[minAvailable] = False
               
#     return answer

# def getNextAvailableRoom(startIdx, availableRoom):
#     for i in range(startIdx, len(availableRoom)):
#         if availableRoom[i] == True:
#             return i

# solution with directed graph, storing parent information [hash map]

def solution(k,room_number):
    answer = []
    parent = {} # parent of each node

    for i, x in enumerate(room_number):
        if x not in parent:
            answer.append(x)
            parent[x] = x + 1
        else:
            tmp = []
            while x in parent:
                tmp.append(x)
                x = parent[x]
            answer.append(x)
            tmp.append(x)
            for i in tmp:
                parent[i] = x + 1
            
    return answer