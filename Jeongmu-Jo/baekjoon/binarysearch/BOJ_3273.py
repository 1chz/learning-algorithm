n = int(input())
lst = sorted(list(map(int, input().split())))
x = int(input())
cnt = 0

def search(target, start, end):
    if start > end:
        return False
    mid = (start + end) // 2
    if target + lst[mid] == x:
        #print(target, lst[mid])
        return True
    if target + lst[mid] < x:
        return search(target, mid + 1, end)
    else:
        return search(target, start, mid - 1)

for i in lst:
    start = 0
    end = n-1
    if search(i, start, end):
        cnt += 1

print(cnt//2)
# ex mid = 7  1 + 7 < x이면 binarasearch(mid+1, end)


#feat(Jeongmu-Jo): [BOJ, 3273] 두 수의 합
