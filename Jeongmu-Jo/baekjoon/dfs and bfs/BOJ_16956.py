R, C = map(int, input().split())
M = [list(input()) for i in range(R)]
#print(M[::][0])
# S : 양, W : 늑대
dx, dy = [0, 1, 0, -1], [1, 0, -1, 0]

ck = False

for i in range(R):
    for j in range(C):
        if M[i][j] == "W":
            for w in range(4):
                ii, jj = i + dx[w], j + dy[w]
                if ii < 0 or ii == R or jj < 0 or jj == C:
                    continue
                else: 
                    if M[ii][jj] == "S":
                        ck = True

if ck:
    print('0')
else:
    for i in range(R):
        for j in range(C):
            if M[i][j] == '.':
                M[i][j] = 'D'
    print(1)
    for i in M:
        print(''.join(i))


    for i in range(R):
        for j in range(C):
            print(M[i][j], end = "")
        print('')
#feat(Jeongmu-Jo): [BOJ, 16956] 늑대와 양