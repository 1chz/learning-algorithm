import heapq


def solution(jobs):
    answer = 0

    jobs_heap = []
    start_time = -1
    current_time = 0
    completed_jobs = 0
    num_of_jobs = len(jobs)

    while num_of_jobs > completed_jobs:
        for job in jobs:
            # 시작시간이 start시간과 current_time사이에 걸쳐있다면
            if start_time < job[0] <= current_time:
                heapq.heappush(jobs_heap, [job[1], job[0]])
        if jobs_heap:
            min_job = heapq.heappop(jobs_heap)
            start_time = current_time
            current_time += min_job[0]
            answer += current_time - min_job[1]
            completed_jobs += 1
        else:
            current_time += 1
    return answer // num_of_jobs


print(solution([[1, 3], [2, 2], [8, 11]]))
