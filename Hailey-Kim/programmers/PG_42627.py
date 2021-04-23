'''
Disc Controller

Given the list of tasks to do [request time, required time],
return the average of (the time a task is done - the time a task is requested).

programmers.co.kr/learn/courses/30/lessons/42627
'''


import heapq
def solution(jobs):
    lenJobs = len(jobs)
    sumT, currT, i = 0, 0, 0
    prevJobStart = -1
    wait = []

    while i < lenJobs:
        for job in jobs:
            if prevJobStart < job[0] <= currT:
                heapq.heappush(wait, [job[1], job[0]])

        if len(wait) > 0:
            curr = heapq.heappop(wait)
            prevJobStart = currT
            currT += curr[0]
            sumT = currT - curr[1]
            i += 1
        else:
            currT += 1
    return sumT // lenJobs

