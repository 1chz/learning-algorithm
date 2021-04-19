def dfs(cnt, idx):
    if cnt == 7:
        res, ans = 0, []
        for i in range(9):
            if select[i]:
                res += arr[i]
                ans.append(arr[i])
        if res == 100:
            ans.sort()
            for s in ans:
                print(s)
            exit()
        return

    for i in range(idx, 9):
        select[i] = 1
        dfs(cnt + 1, i + 1)
        select[i] = 0

arr = [int(input()) for _ in range(9)]
select = [0 for _ in range(9)]
dfs(0, 0)