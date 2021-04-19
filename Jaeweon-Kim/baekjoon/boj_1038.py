# 감소하는 수

def solution(limit, sub):
    global cnt
    global answer
    if len(sub) == limit:
        cnt += 1
        if cnt == n:
            answer = int(sub)
            print(answer)
            exit()
        return
    else:
        if sub == '':
            for i in range(limit-1, 10):
                sub += str(i)
                solution(limit, sub)
                sub = ''
        else:
            for i in range(int(sub[-1])):
                # 가장 처음 맨 앞자리 수를 정한 다음의 수는 나머지 자리 수들보다 커야한다는 조건문
                if limit - len(sub) - 1 > i:
                    continue
                sub += str(i)
                solution(limit, sub)
                sub = sub[:-1]

n = int(input())
cnt = -1
answer = -1

for k in range(1, 11):
    solution(k, '')
print(-1)