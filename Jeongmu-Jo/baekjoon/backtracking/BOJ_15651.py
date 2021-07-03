n, m = map(int, input().split())

array = []                                # 출력할 수열
fn_cnt = 0
pop_cnt = 0
def DFS(x):
    global fn_cnt
    fn_cnt += 1
    if x == m:                  # 수열 m개를 충족할경우 출력
            print(*array)     
            return
            
    for i in range(1,n+1):
        array.append(i) # 수열 추가
        print('array', array)
        DFS(x + 1)           # + 1번째 수열을 위해 재귀함수 호출
        array.pop()          # 수열 마지막 자리 삭제

#DFS(0)

def chk(x):
    print('chk', x)
    if x == 3:
        print(1)
        return
    array.append(x)
    chk(x+1)
    array.pop()
    print('pop')

chk(0)
print(array)

# DFS(0) -> 
#feat(Jeongmu-Jo): [BOJ, 15651] N과 M(3)