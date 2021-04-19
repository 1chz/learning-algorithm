# 멀티탭 스케줄링
n, k = map(int, input().split())
li = list(map(int, input().split()))
multitap = [0] * n
answer = swap = max_l = num = 0

for i in li:
    if i in multitap:
        pass
    elif 0 in multitap:
        multitap[multitap.index(0)] = i
    else:
        for j in multitap:
            if j not in li[num:]:
                swap = j
                break
            elif li[num:].index(j) > max_l:
                max_l = li[num:].index(j)
                swap = j
        multitap[multitap.index(swap)] = i
        max_l = swap = 0
        answer += 1
    num += 1
print(answer)