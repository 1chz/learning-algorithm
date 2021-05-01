# 월드컵

def possible(n):

    if n == 15:
        flag = True
        for score in team_list:
            if score[0] != 0 or score[1] != 0 or score[2] != 0:
                flag = False
                break
        return flag
    
    else:
        temp = False
        for i in range(3):
            team_1 = match_seq[n][0]
            team_2 = match_seq[n][1]
            if team_list[team_1][i] == 0 or team_list[team_2][2-i] == 0:
                continue

            team_list[team_1][i] -= 1
            team_list[team_2][2-i] -= 1
            temp = possible(n+1)
            if temp: return True
            team_list[team_1][i] += 1
            team_list[team_2][2-i] += 1
        return False

ans = []
match_seq = []
for i in range(5):
    for j in range(i+1, 6):
        match_seq.append((i,j))

for _ in range(4):
    records = list(map(int, input().split()))
    team_list = []

    for i in range(6):
        team_list.append(records[i*3 : i*3 + 3])
    
    if possible(0):
        ans.append(1)
    else:
        ans.append(0)

print(*ans)