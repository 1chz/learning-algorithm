# boj 16663 N과 M (9) s2
# noj.am/15663
'''
import itertools

N, M = map(int, input().split())
_list = list(list(map(int, input().split())))
ans = itertools.permutations(_list, M)
ans = sorted(list(set(ans)))

for i in ans:
    print(*i)
'''

# 라이브러리 사용x 풀이
N, M = map(int, input().split())
_list = list(list(map(int, input().split())))
_list.sort()  # 출력 결과가 오름차순이므로
ans = []
check_list = [False] * 10  # 특정 인덱스의 값을 사용했는지 체크, ex) 1 1 / 7 7 과 같은 값 방지


def recursive(idx):
    if idx == M:  # 목표로 한 M 값이면 출력
        print(*ans)
        return

    last = 0  # 마지막 값 저장용, ex) 1 9 / 1 9 와 같은 값 방지
    for i in range(N):
        if check_list[i] == False and last != _list[i]:  # 특정 인덱스의 값을 사용했는지와 마지막 값 체크
            check_list[i] = True
            ans.append(_list[i])
            last = _list[i]
            recursive(idx + 1)
            ans.pop()
            check_list[i] = False


recursive(0)
