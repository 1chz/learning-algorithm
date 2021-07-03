N, M = map(int, input().split())

N_list = sorted([input() for i in range(N)])
M_list = sorted([input() for i in range(M)])

#print(N_list)
#print(M_list)

def binarySearch(list, target, start, end):
    if start > end:
        return False
    mid = (start + end) // 2
    if target == list[mid]:
        return True
    if target > list[mid]:
        return binarySearch(list, target, mid + 1, end)
    else:
        return binarySearch(list, target, start, mid - 1)


cnt = 0
ans = []

for i in M_list:
    start = 0
    end = N-1
    if binarySearch(N_list, i, start, end):
        ans.append(i)
        cnt += 1
        
print(cnt)
for i in ans:
    print(i)
#feat(Jeongmu-Jo): [BOJ, 1764] 듣보잡
