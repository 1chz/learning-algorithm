# boj 19949 영재의 시험 s3
# noj.am/19949

ans = list(map(int, input().split()))


def recursive(sol):
    if len(sol) == 10:  # 10문제의 답이 다 입력되었으면
        cnt = 0
        for i in range(10):
            if sol[i] == ans[i]:  # 정답이 일치할 경우
                cnt += 1
            if cnt >= 5:  # 5점 이상이면 1 아니면 0
                return 1
        return 0
    res = 0
    for i in range(1, 6):  # 5지 선다
        if len(sol) >= 2 and sol[-1] == i and sol[-2] == i:  # 같은 수 3번이상 막기
            continue
        sol.append(i)
        res += recursive(sol)
        sol.pop()

    return res


print(recursive([]))
