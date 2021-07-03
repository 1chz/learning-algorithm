N, M = map(int, input().split())
lesson = list(map(int, input().split()))

start, end = max(lesson), sum(lesson)
# end -> 가능한 블루레이의 크기
while start <= end:
    mid = (start + end) // 2
    # if mid = 17
    bluelay_cnt = 0
    sum_lesson = 0
    for i in lesson:
        if sum_lesson + i > mid:
            bluelay_cnt += 1
            sum_lesson = i
        else:
            sum_lesson += i
            
    if sum_lesson > 0:
        bluelay_cnt += 1
    
    if bluelay_cnt > M:
        #블루레이의 개수가 조건보다 크기때문에 조건 불만족, 
        #블루레이 사이즈를 증가시켜줌
        #가능한 블루레이의 개수가 최소가 되는것
        start = mid + 1
    else:
        ans = mid
        end = mid - 1
print(ans)
# M -> 블루레이의 개수, 블루레이의 크기 중 최소
#feat(Jeongmu-Jo): [BOJ, 2343] 기타 레슨
