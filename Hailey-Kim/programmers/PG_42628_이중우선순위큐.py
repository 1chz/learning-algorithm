'''
Double Priority Queue

"I <number>" means insert number.
"D 1" and "D -1" means delete the max/min number in the queue.
Given the list of operations return [max, min] from the queue
, or [0,0] if empty, at the end of operation.


programmers.co.kr/learn/courses/30/lessons/42628 

03.11.21
'''
from collections import deque
from bisect import bisect_left, insort_left

def solution(operations):
    queue = deque()
    
    for e in operations:
        if e[0] == 'I':
            num = int(e.split(' ')[1])
            index = bisect_left(queue, num)
            queue.insert(index, num)
        elif e == 'D 1':
            if queue:
                queue.pop()
        elif e == 'D -1':
            if queue:
                queue.popleft()
            
    if queue:
        answer = [queue.pop(),queue.popleft()]
    else:
        
        answer = [0,0]

        
    return answer