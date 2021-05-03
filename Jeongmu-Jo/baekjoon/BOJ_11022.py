N = int(input())

for i in range(N):
    A, B = map(int, input().split())
    print("Case #",i+1,": ",A," + ",B," = ",(A+B), sep ="")


#feat(Jeongmu-Jo): [BOJ, 11022] A + B - 8