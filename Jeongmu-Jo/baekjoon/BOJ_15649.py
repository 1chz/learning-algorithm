from itertools import permutations
N, M = map(int, input().split())
lst = [i+1 for i in range(N)]
permus = permutations(lst, M)

for permu in permus:
    for i in range(len(permu)):
        print(permu[i], end=" ")
    print("")
#feat(Jeongmu-Jo): [BOJ, 15649] N과 M(1)