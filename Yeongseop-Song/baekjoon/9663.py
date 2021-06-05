# 9663 N-Queen g5
# noj.am/9663


# 가로, 세로, 대각선으로 놓일 수 없다.
N = int(input())


def recursive(_list):
    if len(_list) == N:
        return 1
    ans = 0
    for i in range(1, N + 1):
        flag = True
        for idx, val in enumerate(_list):
            # 가로, 세로로 놓일 수 없다
            if i == val:
                flag = False
                break
            # 대각선으로 놓일 수 없다
            # 넣으려는 값과 리스트에 있는 값을 돌면서 확인했을때
            # 그 차이가 각각의 인덱스와 차이가 같다면 대각선
            if abs(i - val) == len(_list) - idx:  # 배열의 길이는 인덱스보다 1크므로 다음에 넣을 값의 인덱스
                flag = False
                break
        if flag:  # 놓을 수 없는 두가지 조건이 아니라면 추가
            _list.append(i)
            ans += recursive(_list)  # 백트래킹을 위한 재귀호출
            _list.pop()
    return ans


print(recursive([]))
