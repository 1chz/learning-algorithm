# 청소년 상어

from copy import deepcopy

arr = [[None] * 4 for _ in range(4)]

for i in range(4):
    data = list(map(int, input().split()))
    # 매 줄마다 4 마리의 물고기를 하나씩 확인하며.
    for j in range(4):
        # 각 위치마다 [물고기 번호, 방향] 저장
        arr[i][j] = [data[j * 2], data[j * 2 + 1] - 1]

dx = [-1,-1,0,1,1,1,0,-1]
dy = [0,-1,-1,-1,0,1,1,1]

def turn_left(direction): # 갈곳이 막혔을때 45도 반시계 방향으로 전환
    return (direction + 1) % 8

result = 0

def find_fish(array, index):
    for i in range(4):
        for j in range(4):
            if array[i][j][0] == index:
                return (i,j)
    return None

def move_all_fish(array, now_x, now_y):
    # 1번부터 16번까지 물고기를 차례대로 (낮은 번호부터) 이동
    for i in range(1, 17):
        # 해당 물고기의 위치를 찾기
        position = find_fish(array, i)
        if position != None:
            x, y = position[0], position[1]
            direction = array[x][y][1]
            # 해당 물고기가 가르키는 방향으로 이동이 가능한지 확인
            for j in range(8):
                nx = x + dx[direction]
                ny = y + dy[direction]
                if 0 <= nx < 4 and 0 <= ny < 4:
                    if not(nx == now_x and ny == now_y):
                        array[x][y][1] = direction
                        array[x][y], array[nx][ny] = array[nx][ny], array[x][y]
                        break
                direction = turn_left(direction)

# 상어가 현재 위치에서 먹을 수 있는 모든 물고기의 위치 반환
def get_possible_shark_positions(array, now_x, now_y):
    positions = []
    direction = array[now_x][now_y][1]
    # 현재의 방향으로 쭉 이동하기
    for i in range(4):
        now_x += dx[direction]
        now_y += dy[direction]
        # 범위를 벗어나지 않는지 확인하며
        if 0 <= now_x and now_x < 4 and 0 <= now_y and now_y < 4:
            # 물고기가 존재하는 경우
            if array[now_x][now_y][0] != -1:
                positions.append((now_x, now_y))
    return positions

def dfs(arr, now_x, now_y, total):
    global result
    array = deepcopy(arr) # 리스트를 통채로 복사
    
    total += array[now_x][now_y][0] # 현재 위치의 물고기 먹기
    array[now_x][now_y][0] = -1 # 물고기를 먹었으므로 변한 값은 -1로 변환

    move_all_fish(array, now_x, now_y) # 전체 물고기 이동 시키기

    # 이제 다시 상어가 움직일 차례이므로, 이동 가능한 위치 찾기
    positions = get_possible_shark_positions(array, now_x, now_y)
    # 이동할 수 있는 위치가 하나도 없다면 종료
    if not positions:
        result = max(result, total)
        return
    # 모든 이동할 수 있는 위치로 재귀적으로 수행
    for next_x, next_y in positions:
        dfs(array, next_x, next_y, total)


dfs(arr, 0, 0, 0)
print(result)