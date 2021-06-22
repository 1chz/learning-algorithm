def binary_search(a, b_lst):
    start = 0
    end = len(b_lst)-1
    idx = -1
    while start <= end:
        mid = (start+end)//2
        if a > b_lst[mid]:
            idx = mid
            start = mid + 1
        else:
            end = mid - 1
    return idx

for i in range(int(input())):
    
    n, m = map(int, input().split())
    A = sorted(list(map(int, input().split())))
    B = sorted(list(map(int, input().split())))
    cnt = 0
    for i in A:
        if binary_search(i, B) != -1:
            cnt += binary_search(i, B) + 1
    print(cnt)
#feat(Jeongmu-Jo): [BOJ, 7795] 먹을 것인가 먹힐 것인가
