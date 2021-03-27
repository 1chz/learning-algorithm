# time: O(n) solution as we keep traveling only islands
# space: O(1)
# Runtime: 124 ms, faster than 95.18% of Python3
# Memory Usage: 15.6 MB, less than 37.93% of Python3

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        row_num, col_num, result = len(grid), len(grid[0]), 0

        def traversal(i: int, j: int, grid: list) -> None:
            if grid[i][j] == "0":
                return
            grid[i][j] = "0"
            if i != 0:
                traversal(i - 1, j, grid)
            if j != 0:
                traversal(i, j - 1, grid)
            if i != row_num - 1:
                traversal(i + 1, j, grid)
            if j != col_num - 1:
                traversal(i, j + 1, grid)
            return

        for i in range(row_num):
            for j in range(col_num):
                if grid[i][j] == "1":
                    result += 1
                    traversal(i, j, grid)

        return result