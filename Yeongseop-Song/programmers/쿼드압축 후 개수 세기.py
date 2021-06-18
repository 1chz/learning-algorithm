# programmers 쿼드압축 후 개수 세기 lv2
# https://programmers.co.kr/learn/courses/30/lessons/68936

def solution(arr):
    answer = [0, 0]
    n = len(arr)
    # 8, 0, 0
    # 4, 0, 0
    # 4, 0, 4
    # 4, 4, 0
    # 4, 4, 4
    def recursive(n, x, y):
        val = arr[x][y]
        for i in range(x, x + n):
            for j in range(y, y + n):
                if val != arr[i][j]: # 압축이 불가능 할 경우
                    n //= 2
                    recursive(n, x, y)
                    recursive(n, x + n, y)
                    recursive(n, x, y + n)
                    recursive(n, x + n, y + n)
                    return
        
        answer[val] += 1 # 압축가능해서 압축했을 경우, 1개만 확인할 경우
    
    recursive(n, 0, 0)
    return answer