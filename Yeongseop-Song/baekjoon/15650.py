# boj 15650 N과 M (2) s3
# noj.am/15650

N, M = map(int, input().split())
ans = []


def recursive():
    if len(ans) == M:  # 원하는 길이일 경우 출력
        print(*ans)

    for i in range(1, N + 1):
        if i not in ans:  # i가 리스트안에 없다면
            # 리스트의 마지막값이 i보다 크면 skip -> 오름차순이 안되므로 ex) 마지막값:3 i:1   3 1은 내림차순
            if len(ans) != 0 and ans[-1] > i:
                continue
            ans.append(i)
            recursive()
            ans.pop()


recursive()
