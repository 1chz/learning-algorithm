T = int(input())
    
def teacher(N, candy):
    tmp_list = [0 for i in range(N)]
    for idx in range(N):
        if candy[idx] %2 == 1:
            candy[idx] += 1
        candy[idx] //= 2
        tmp_list[(idx + 1) % N] = candy[idx]

    for idx in range(N):
        candy[idx] += tmp_list[idx]

    return candy

def check(N, candy):
    for i in range(N):
        if candy[i]%2 == 1:
            candy[i] += 1
    return len(set(candy)) == 1
    # 캔디의 개수가 모두 같아지면 ret True

def process():
    N, candy = int(input()), list(map(int, input().split()))
    cnt = 0
    while not check(N, candy):
        cnt += 1
        candy = teacher(N, candy)
    print(cnt)

for i in range(T):
    process()

#feat(Jeongmu-Jo): [BOJ, 9037] The candy war