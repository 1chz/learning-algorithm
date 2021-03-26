# 연산자 끼워넣기
import sys
input = sys.stdin.readline

def dfs(cnt, result, plus, minus, mul, div):
    global max_result, min_result
    if cnt == n:
        max_result = max(max_result, result)
        min_result = min(min_result, result)
    
    if plus:
        dfs(cnt+1, result+s[cnt], plus-1, minus, mul, div)
    if minus:
        dfs(cnt+1, result-s[cnt], plus, minus-1, mul, div)
    if mul:
        dfs(cnt+1, result*s[cnt], plus, minus, mul-1, div)
    if div:
        dfs(cnt+1, -(-result // s[cnt]) if result < 0 else result // s[cnt], plus, minus, mul, div-1)
        
n = int(input())
s = list(map(int, input().split()))
op = list(map(int, input().split()))

max_result = int(-1e9)
min_result = int(1e9)
dfs(1, s[0], op[0], op[1], op[2], op[3])
print(max_result)
print(min_result)