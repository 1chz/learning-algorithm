import sys

#sys.stdin = open('input.txt','rt')

N = int(input())
answer = []
for i in range(N):
    word = input()
    if len(word) <=1:
        answer.append('NO')
        continue
    while True:
        if len(word) <=1:
            answer.append('YES')
            break
        elif word[0].upper() == word[-1].upper():
            word = word[1:-1]
        elif word[0].upper() != word[-1].upper():
            answer.append('NO')
            break

for i in range(len(answer)):
    print('#%d %s' %(i+1, answer[i]))