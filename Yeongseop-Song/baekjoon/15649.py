# boj 15649 N과 M (1) s3
# noj.am/15649

N, M = map(int, input().split())
ans = []


def recursive():
    if len(ans) == M:  # 리스트의 길이가 M이라면 출력
        print(*ans)

    for i in range(1, N + 1):
        if i not in ans:  # 리스트에 i 가 있으면 skip, 없으면 추가
            ans.append(i)
            recursive()
            ans.pop()  # 백트래킹을 위해서 pop


recursive()
