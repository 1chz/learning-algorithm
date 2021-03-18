# 구현
from typing import List, Tuple

# 상하좌우로 이동하여 좌표 출력하는 문제
def move(n: int, plans: List[str]) -> List[int]:
    '''
    n x n 공간에서
    plans (L, R, U, D)에 따라서 이동하여
    도착하는 최종 좌표 반환
    '''
    # plans을 돌면서 순차적으로 해결?
    # 쉽게 풀수 있겠지만 시간복잡도 올라갈거같음
    # 개수를 세고 해결
    # 복잡하지만 최종 결과까지 바로 계산 가능
    current = [1, 1]
    for plan in plans:
        if plan == 'L' and current[1] > 1:
            current[1] -= 1
        if plan == 'R' and current[1] < n:
            current[1] += 1
        if plan == 'U' and current[0] > 1:
            current[0] -= 1
        if plan == 'D' and current[0] < n:
            current[0] += 1

    return current

# 모범답안
def move_solution(n: int, plans: List[str]) -> List[int]:
    # L, R, U, D 이동방향 정의
    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]
    move_types = ['L', 'R', 'U', 'D']
    x, y = n
    for plan  in plans:
        for i in range(len(move_types)):
            if plan == move_types[i]:
                nx = x + dx[i]
                ny = y + dy[i]
        # 공간을 벗어나는걸 한번에 확인
        if nx < 1 or ny < 1 or nx > n or ny > n:
            continue
    return [nx, ny]

# 시각 문제
def time(n: int) -> int:
    '''
    정수 n 이 입력되면 00:00:00 ~ n:59:59까지 모든 시간 중
    3이 하나라도 포함되는 모든 경우의 수
    # 30분 / 실패
    '''
    # 0시~0시면 0 반환
    if n == 0:
        return n
    # with_3 = 3이 들어가는 시간일떄 개수(3, 13) 00:00 ~ 59:59 모두 포함
    with_3 = 3600
    # without_3 = 3이 안들어가는 시간일때 개수
        # 10분에 들어가는 경우; 3x:xx -> 60 * 10
        # 분에 들어가는 경우; x3:xx -> 60 * 5
            # 33:xx 제외; - 60 * 1
        # 10초에 들어가는 경우; xx:3x -> 10 * 60
            # 3x:3x 제외; - 10 * 10
            # x3:3x 제외; - 10 * 5
                # + 중복제외된값 추가? 
                # 33:3x; + 10
        # 초에 들어가는 경우; xx:x3 -> 10 * 60
            # xx:33 제외; - 1 * 60
            # x3:x3 제외; - 10 * 10
            # 3x:x3 제외; - 10 * 10
                # + 중복제외 추가
                # x3:33; + 10 * 1
                # 3x:33; + 10 * 1
                # 33:x3; + 10 * 1
    without_3 = (60*10) + (60*5) - (60*1) + (10 * 60) - (10 * 10) - (10 * 5) + 10 + (10 * 60) - (1 * 60) - (10 * 10) - (10 * 10) + (10 * 3)

    # 13시보다 크면 
    if n >= 13:
        return with_3 * 2 + without_3 * (n-2)
        # 3, 13시 모두 포함 -> with_3 * 2
        # (n-2) * without_3
    elif n >=3 and n < 13:
        return with_3 + (n-1) * without_3
    # 3시보다 크고 13시보다 작으면 3시만 포함
        # with_3 * 1
        # (n-1) * without_3
    else:
        return n * without_3
    # 3시보다 작으면 둘다 미포함
        # n * without_3

def time_solution(n):
    # 완전탐색 (brute forcing) 유형
    # 가능한 모든 시각의 경우를 세서 풀 수 있음.
    # 86400가지는 그다지 많지 않기 때문에 00:00:00부터 1씩 증가하면서 하나라도 포함되는지 확인
    count = 0
    for hour in range(n + 1):
        for minute in range(60):
            for second in range(60):
                if '3' in str(hour) + str(minute) + str(second):
                    count += 1
    return count

def chess_night(coordinate: str) -> int:
    '''
    8x8 특정 좌표에서 나이트가 이동 가능한 경우의 수
    '''
    # 체스 이동: 8가지 가능
    dx = [-2, -2, -1, -1, 2, 2, 1, 1]
    dy = [1, -1, 2, -2, 1, -1, 2, 2]

    # x, y index 구하기
    x = 'abcdefgh'.index(coordinate[0])
    y = int(coordinate[1]) - 1

    count = 0
    for i in range(7):
        nx = x + dx[i]
        ny = y + dy[i]
        if nx < 0 or ny < 0 or nx > 7 or ny > 7:
            continue
        count += 1
    return count

# 풀이
def chess_night_solution(coordinate: str) -> int:
    row = int(coordinate[1])
    column = int(ord(input_data[0])) - int(ord('a')) + 1
    steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]
    result = 0

    for step in steps:
        next_row = row + step[0]
        next_column = column + step[1]
        if next_row >= 1 and next_row <= 8 and next_column >= 1 and next_column <= 8:
            result += 1
    return result

# 문자열 재정렬
def string_reorder(S: str) -> str:
    '''
    알파벳 대문자, 숫자(0~9)로 구성된 문자열
    알파벳을 오름차순으로, 그 뒤에 모든 숫자를 더한 값을 출력
    '''
    # 알파벳, 숫자 나누고
    # 알파벳 정렬
    # 결과 만들기
    strings = []
    sum_of_numbers = 0
    for s in S:
        try:
            sum_of_numbers += int(s)
        except ValueError:
            strings.append(s)

    strings.sort()
    if sum_of_numbers:
        strings.append(str(sum_of_numbers))
    ss = ''.join(strings)
    return ss

# def flood_fill(image, sr, sc, newColor):
#     R, C = len(image), len(image[0])
#     color = image[sr][sc]
#     if color == newColor: return image
#     def dfs(r, c):
#         if image[r][c] == color:
#             image[r][c] = newColor
#             if r >= 1: dfs(r-1, c)
#             if r+1 < R: dfs(r+1, c)
#             if c >= 1: dfs(r, c-1)
#             if c+1 < C: dfs(r, c+1)
# 
#     dfs(sr, sc)
#     return image

# # 733. flood fill
def flood_fill(image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
    '''
    changed = []
    start_pixel 상하좌우 중 색깔이 같은 애들 changed에 추가
    up: (1,1) -> (0,1) -> (sr-1, sc)
    down: (1,1) -> (2,1) -> (sr+1, sc)
    left: (1,1) -> (1,0) -> (sr, sc-1)
    right: (1,1) -> (1,2) -> (sr, sc+1)
    
    [sr][sc]
    up: [sr-1][sc]
    down: [sr+1][sc]
    left: [sr, sc-1]
    right: [sr, sc+1]
    
    있다면 changed에 있는 애들을 newColor로 변경
    changed를 돌면서(빼면서) 다시 반복

    -> 2, 2가 바뀌는 문제
    # 요거 왜 변경되야하는지.. 문제를 잘못 이해한듯 ㅠㅠ
    (1,1) -> 2
    [0,0,0]
    [0,1,0]

    [0,0,0]
    [0,2,0]

    [[0,0,0],[0,1,0]]
    '''
    changed = []
    def change_UDLR(start: tuple, origin: int, changed: list):
        # 해당 start 시점에서 시작해서 UDLR 돌면서 origin과 일치하는 애들을 1로 바꿔줌
        sr, sc = start
        UDLR = ((sr-1, sc), (sr+1, sc), (sr, sc-1), (sr, sc+1))
        for new in UDLR:
            # -1일경우 안함
            new_sr, new_sc = new[0], new[1]
            if 0 > new_sr or 0 > new_sc:
                continue
            # 이미 변경된 경우 안함 -> 변경된 컬럼 따로 저장
            try:
                if image[new_sr][new_sc] == origin:
                    image[new_sr][new_sc] = newColor
                    changed.append((new_sr, new_sc))
            except IndexError:
                pass
        return changed
    
    origin = image[sr][sc]
    # 처음에 한번 돌림
    change_UDLR((sr, sc), origin, changed)
    # 그다음부터는 changed 있을때마다 돌림
    while len(changed):
        new_start_tuple = changed.pop()
        change_UDLR(new_start_tuple, origin, changed)
    return image
