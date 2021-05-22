N, B = int(input()), list(map(int, input().split()))

# A = 1,3,2,6,8  B = 1/N, (1+3)/N, (1+3+2)/N
# (a1) = (b1) $ B2 = (a1 + a2) / 2
# B2 * N = (a1 + a2)
# B3 * N = (a1+a2+a3)

A = [B[0]]
plus_obj = 0
tmp = 0


#for i in range(1, N):
#    plus_obj = plus_obj + A[i-1]
#    tmp = (B[i]*(i+1)) - plus_obj
#    A.append(tmp)
        
for i in range(1, N):
    A.append(B[i]*(i+1) - sum(A))

for i in A:
    print(i, end=' ')

#feat(Jeongmu-Jo): [BOJ, 10539] 수빈이와 수열