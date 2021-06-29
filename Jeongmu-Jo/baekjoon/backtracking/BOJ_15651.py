n, m = map(int, input().split())

array = []                                # 출력할 수열
fn_cnt = 0
pop_cnt = 0
def DFS(x):
    print('DFS', x)
    print('array', array)
    if x == m:                  # 수열 m개를 충족할경우 출력
            print(*array)     
            return
            
    for i in range(1,n+1):
        array.append(i) # 수열 추가
        DFS(x + 1)           # + 1번째 수열을 위해 재귀함수 호출
        array.pop()          # 수열 마지막 자리 삭제
        print('pop')
DFS(0)

# DFS(0) -> 