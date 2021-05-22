'''
Speed Camera

Every car which passes the highway should meet a speed camera at least once.
When routes list - containing routes of each car - is given,
return the minimum number of security cams needed.


programmers.co.kr/learn/courses/30/lessons/42884

03/14/21
'''

def solution(routes):
    answer = 0
    # sort
    routes.sort(key=lambda x: x[0])
    minPos = routes[0][0]
    maxPos = routes[0][1]

    for x in routes:
        # if no overlap
        if x[0] > maxPos:
            minPos = x[0]
            maxPos = x[1]
            answer += 1
        else:
            minPos = max(minPos, x[0])
            maxPos = min(maxPos, x[1])
    answer += 1

    return answer