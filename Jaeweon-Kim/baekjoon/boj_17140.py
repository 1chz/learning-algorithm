# 이차원 배열과 연산

from collections import Counter

r,c,k = map(int, input().split())
arr = [list(map(int,input().split())) for _ in range(3)]
r -= 1
c -= 1
time = 0 # 시간
while time <= 100:
    if r < len(arr) and c < len(arr[0]) and arr[r][c] == k: # 정답 확인
        print(time)
        break
    
    c_flag = False
    # C연산인 경우: transpose
    if len(arr) < len(arr[0]):
        c_flag = True
        arr = list(zip(*arr))
    
    # R연산 수행
    max_len = 0
    tmp_arr = []
    for row in arr:
        ctr = Counter(row)
        if ctr.get(0):
            del ctr[0]
        num_cnt = list(map(list, ctr.items()))
        num_cnt.sort(key = lambda x:(x[1],x[0])) # 주어진 조건대로 오름차순 정렬
        tmp_arr.append(list(sum(num_cnt, []))[:100]) # 100개 까지만 array에 추가
        # print(tmp_arr)
        max_len = max(max_len, len(tmp_arr[-1]))

    for i in range(len(tmp_arr)):
        for j in range(len(tmp_arr)):
            tmp_arr[i] += [0] * (max_len - len(tmp_arr[i])) # 최대 길이에 맞추기

    arr = tmp_arr
    if c_flag: # C연산 인경우 다시 transpose해서 원래대로 재배치
        arr = list(zip(*arr))
    time += 1

if time > 100:
    print(-1)