N = int(input())
info = input().replace('LL', 'L')

cup_count = len(info) + 1
# 컵 홀더의 개수
# N은 좌석의 개수이나 이 줄에 사람들이 모두 앉는다고 하였으므로
# == 사람의 수
# S 혼자일 경우 컵 홀더가 하나 더 많음
# but 출력은 컵홀더에 컵을 놓을 수 있는 최대 사람의 수

if cup_count > N :
    print(N)
else :
    print(cup_count)



#[브~골] 탐욕법(Greedy) 48제 #3
#feat(Jeongmu-Jo): [BOJ, 2810] 컵홀더