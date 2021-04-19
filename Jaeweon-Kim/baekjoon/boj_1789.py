# 수들의 합
n = int(input())

temp = 1
answer = 0

while True:
    n -= temp
    
    if n >= 0:
        answer += 1
        temp += 1
        
    else:
        print(answer)
        break