N , M = map(int, input().split())
A, B = input().split()
alp = [3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1]

AB = ''
min_len = min(N, M)

for i in range(min_len):
    AB += A[i] + B[i]

AB += A[min_len:] + B[min_len:]
lst = []

for i in AB:
    lst.append(alp[ord(i) - ord('A')])

#print(lst)

for i in range(N+M-2):
    for j in range(N+M-1-i):
        # 초기 20번 반복하고 lst는 1개 줄어든 19개를 가짐
        # N + M 이 전체 반복 개수기 때문에 N+M-1 / 위에 range(N+M-2)와 햇갈리지 않기
        # N+M-2 가 20일때 처음 19번, 두번 18번, 세번 17번 ...
        lst[j] += lst[j+1]
        lst[j] %= 10
#print(lst[0], lst[1])

print("{}%".format(lst[0]*10 + lst[1]))
#feat(Jeongmu-Jo): [BOJ, 17269] 이름궁합 테스트