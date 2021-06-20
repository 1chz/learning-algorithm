N = int(input())
S = input()

bonus = 0
ans = 0

for i in range(len(S)):
    if S[i] == 'O':
        ans += i+1+bonus
        bonus += 1
    else:
        bonus = 0


ans = 0
bonus = 0
    
for idx, OX in enumerate(S):
#    print(idx, OX)
    if OX == 'O':
        ans += idx + 1 + bonus
        bonus += 1
    else:
        bonus = 0

print(ans)

#feat(Jeongmu-Jo): [BOJ, 17389] 보너스 점수
