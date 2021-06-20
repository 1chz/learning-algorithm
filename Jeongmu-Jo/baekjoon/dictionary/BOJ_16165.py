N, M = map(int, input().split())
# N : 걸그룹의 수, M : 맞혀야 할 문제의 수
# 팀 이름, 인원수, 맴버 이름

# N번 만큼 입력 후 M개의 퀴즈를 입력받음, 팀 or 맴버 이름, 0 : 팀이름(맴버맞추기
# 1 : 맴버이름(팀 맞추기)

# dictionary, list 함께 사용하는 문제

team_mem, mem_team = {}, {}

for i in range(N):
    team_name, mem_num = input(), int(input())
    team_mem[team_name] = []
    for j in range(mem_num):
        name = input()
        team_mem[team_name].append(name)
        mem_team[name] = team_name

#print(team_mem['twice'][0])
#print(mem_team)

for i in range(M):
    name = input()
    quiz_kind = int(input())
    if quiz_kind:
        print(mem_team[name])
    else:
        for mem in sorted(team_mem[name]):
            print(mem)

#print(team_mem['twice'])
#print(sorted(team_mem['twice'], reverse=False))

#feat(Jeongmu-Jo): [BOJ, 16165] 걸그룹 마스터 준석이