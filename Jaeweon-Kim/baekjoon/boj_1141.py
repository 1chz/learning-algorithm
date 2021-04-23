# 접두사

N = int(input())
strings = []
for _ in range(N):
    strings.append(input())

strings.sort(key=len)
ans = 0
for i in range(N):
    cur_word = strings[i]
    flag = False
    for j in range(i+1, N):
        try:
            if strings[j].index(cur_word) == 0:
                print("######", strings[j], cur_word)
                flag = True
                break
        except:
            continue
    if not flag:
        ans += 1
print(ans)
