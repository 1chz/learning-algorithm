# 시험 감독

N = int(input())
A = list(map(int, input().split()))
B, C = map(int, input().split())
result = 0

for i in range(len(A)):
    if A[i] >= B:
        A[i] -= B
        if A[i] % C == 0:
            result += A[i] // C
        else:
            result += A[i] // C + 1

print(result + N)