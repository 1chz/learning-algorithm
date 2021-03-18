# https://leetcode.com/problems/island-perimeter/
# -> 이렇게 풀었더니 [[1]]같이 땅이 한개만 있을때에는 0 반환함
def solution_first(grid: list) -> int:
    # 최대 100까지밖에 안됨 -> 브루트포스
    # 모든 있는 애들을 확인하면서
    # 입접한 곳에 땅이 있으면 pass
    # 수면이면 +=1
    count = 0

    near = [(0, 1), (0, -1), (1, 0), (-1, 0)]

    for i in range(len(grid) - 1):
        for j in range(len(grid) - 1):
            coord = grid[i][j]
            for x, y in near:
                try:
                    next_grid = grid[i+x][j+y]
                # 없으면 패스
                except IndexError:
                    continue
                # 인접한 곳이 땅이면 pass
                if next_grid == 1:
                    continue
                count += 1
    return count


def solution(grid: list) -> int:
    # 최대 100까지밖에 안됨 -> 브루트포스
    # 모든 있는 애들을 확인하면서
    # 입접한 곳에 땅이 있으면 pass
    # 수면이면 +=1
    rows = len(grid)
    cols = len(grid[0])

    def dfs(i, j):
        # u, d, l, r을 모두 확인해서 땅이 아닌 개수 반환
        U, D, L, R = 0, 0, 0, 0
        if i > 0 and grid[i-1][j] == 1:
            U = 1
        if j > 0 and grid[i][j-1] == 1:
            L = 1
        if i < rows-1 and grid[i+1][j] == 1:
            D = 1
        if j < cols-1 and grid[i][j+1] == 1:
            R = 1
        return 4 - (U + L + D + R)

    count = 0
    for i in range(rows):
        for j in range(cols):
            if grid[i][j] == 1:
                count += dfs(i, j)
    return count
