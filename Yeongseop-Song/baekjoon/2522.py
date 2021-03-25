# boj 2522 별 찍기 - 12 b3
# noj.am/2522

# 절반 나눠서 구현
N = int(input())
for i in range(N):  # N개의 행까지
    for _ in range(N - i, 1, -1):  # 공백 N-i개 부터 시작해서 1개씩 점점 줄어듬
        print(" ", end="")
    for _ in range(i + 1):  # 행의 숫자만큼 * 출력 ex) 1행 1개, 2행 2개 ...
        print("*", end="")
    print()

for i in range(N - 1, 0, -1):  # N-1개의 행까지
    for _ in range(N - i):  # 공백 1개부터 시작해서 점점 늘어남(i가 줄어드므로)
        print(" ", end="")
    for _ in range(i):  # i의 숫자 개수만큼 * 출력
        print("*", end="")
    print()
