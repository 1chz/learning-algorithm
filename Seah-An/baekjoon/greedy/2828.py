import sys

input = sys.stdin.readline

#N은 스크린의 크기, M은 바구니가 차지하는 칸의 크기
N, M = map(int, input().split())
#사과 개수
J = int(input())

start = 1
end = M
distance = 0

apple = [] * J

for i in range(J):
    #사과가 떨어지는 위치
    apple.append(int(input()))

    #사과가 처음 시작하는 위치보다 왼쪽일 경우
    if apple[i] < start:
        # 현재 start와 사과가 떨어지는 위치를 빼줘서 거리를 구해 더한다.
        distance += start - apple[i]
        # 바구니의 시작 위치를 현재 떨어진 사과의 위치로 옮긴다
        start = apple[i]
        # 바구니의 끝 위치를 현재 떨어진 사과의 위치에서 바구니 크기를 더한뒤 1을 빼준다.
        end = apple[i] + M - 1
    # 사과가 바구니 위치보다 오른쪽에 있을 경우
    elif apple[i] > end:
        # 사과의 위치에서 현재 바구니의 위치를 빼서 거리를 구한다
        distance += (apple[i] - end)
        # 바구니 끝쪽(오른쪽)이 사과가 떨어진 위치
        end = apple[i]
        start = end - M + 1
print(distance)
