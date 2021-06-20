ML, MR, TL, TR = ('SRP'.index(i) for i in input().split())
# S, R, P -> 가위, 바위, 보
# moduler연산 0 1 2
#('SRP'.find(i) for i in input().split())
# 한사람이 같은 것을 냈을 때 이김
# ML = R 2 / TL = S 0 
if ML == MR and (ML+1) % 3 in [TL, TR]:
    print("TK")
elif TL == TR and (TL+1) % 3 in [ML, MR]:
    print("MS")
else:
    print('?')
#feat(Jeongmu-Jo): [BOJ, 16675] 두 개의 손