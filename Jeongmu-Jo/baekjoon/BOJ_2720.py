N = int(input())
charge_list = [25, 10, 5, 1]

for _ in range(N):
    ans_list = [0, 0, 0, 0]
    C = int(input())
    idx = 0
    while True:
        if C - charge_list[idx] >= 0:
            ans_list[idx] += 1
            C -= charge_list[idx]
        elif C == 0:
            break
        else :
            idx += 1
    print(ans_list[0], ans_list[1], ans_list[2], ans_list[3])


#[브~골] 탐욕법(Greedy) 48제 #4
#feat(Jeongmu-Jo): [BOJ, 2720] 세탁소 사장 동혁