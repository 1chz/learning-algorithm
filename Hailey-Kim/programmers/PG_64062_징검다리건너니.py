"""
징검다리 건너기
https://programmers.co.kr/learn/courses/30/lessons/64062
06/21/2021
"""
def solution(stones, k):
    answer = 0
    start = 0
    end = max(stones)
    
    if len(stones) == 1: return  stones[0]
    if k == 1: return min(stones)
    
    while start<=end:
        # check for mid num of friends
        mid = (start + end) // 2
        countingZeros = 0
        impossible = False
        wasZero = False
        for i in stones:
            if i - mid < 0:
                if wasZero:
                    countingZeros += 1
                wasZero = True
                countingZero = 1
            else:
                countingZeros = 0           
                wasZero = False
                
            if countingZeros >= k - 1:
                impossible = True
                break
        if impossible:
            end = mid - 1
        else:
            answer = max(answer, mid)
            start = mid + 1
            
    return answer