# 스타트와 링크

N = int(input())
# 연산을 수행하고자 하는 수 리스트
team = [list(map(int, input().split())) for _ in range(N)]

myteam = [False] * N
min_value = 1e9
num = 0

def backtracking_bfs(count, index):
    global min_value, num

    if count == N//2:
        # print(num, myteam)
        # num += 1
        s_team, link_team = 0, 0
        for i in range(N):
            for j in range(N):
                if myteam[i] and myteam[j]:
                    s_team += team[i][j]
                if not myteam[i] and not myteam[j]:
                    link_team += team[i][j]
        min_value = min(min_value, abs(s_team - link_team))
        return

    if N == index:
        # print(num, myteam, "here")
        # num += 1
        return


    myteam[index] = True
    backtracking_bfs(count + 1, index + 1)
    myteam[index] = False
    backtracking_bfs(count, index + 1)

backtracking_bfs(0, 0)
print(min_value)