arr = sorted(list(map(int, input().split())))

ans = 0

if len(set(arr)) == 1:
    ans += arr[0]*1000 + 10000
elif len(set(arr)) == 2:

    ans += arr[1]*100 + 1000
else:
    ans += max(arr)*100

print(ans)
#feat(Jeongmu-Jo): [BOJ, 2480] 주사위 세개