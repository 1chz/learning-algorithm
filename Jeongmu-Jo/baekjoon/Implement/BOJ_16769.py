full = []
present = []

for _ in range(3):
    a, b = map(int, input().split())
    full.append(a), present.append(b)


def pours(full, present, idx):
    sum = present[idx%3] + present[(idx+1)%3]
    #(idx+1)%3 -> 다음 통의 인덱스
    sub = sum - full[(idx+1)%3]

    if sub >0: #다음 통 용량 초과 시
        present[(idx+1)%3] = full[(idx+1)%3]
        present[idx%3] = sub
    else :
        present[(idx+1)%3] = sum
        present[idx%3] = 0
    sub = 0
    return present


for i in range(100):
    present = pours(full, present, i)

for i in range(3):
    print(present[i])

#feat(Jeongmu-Jo): [BOJ, 16769] Mixing Milk