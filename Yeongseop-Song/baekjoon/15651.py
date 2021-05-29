# boj 15651 N과 M (3) s3
# noj.am/15651


N, M = map(int, input().split())
ans = []


def recursive(ans):
    if len(ans) == M:  # 원하는 길이에 도달하면 출력
        print(*ans)
        return
    for i in range(1, N + 1):
        ans.append(i)
        recursive(ans)
        ans.pop()  # 백트래킹을 위해서 마지막 원소하나 pop


recursive(ans)
