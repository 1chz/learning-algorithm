N, lst_b = int(input()), list(map(int, input().split()))

# A = 1,3,2,6,8  B = 1/N, (1+3)/N, (1+3+2)/N
# (a1) = (b1) $ B2 = (a1 + a2) / 2
# B2 * N = (a1 + a2)
# B3 * N = (a1+a2+a3)

lst_a = [lst_b[0]]
plus_obj = 0
tmp = 0


for i in range(N):
    if i > 0:
        plus_obj = plus_obj + lst_a[i-1]
        tmp = (lst_b[i]*(i+1)) - plus_obj
        lst_a.append(tmp)
        

for i in lst_a:
    print(i, end=' ')

