# boj 11943 파일 옮기기 b4
# noj.am/11943

A, B = map(int, input().split())
C, D = map(int, input().split())

print(min(A + D, B + C))
