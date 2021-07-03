doc = list(input())
word = list(input())
cnt = 0
idx = 0

while len(doc) - idx >= len(word):
    if doc[idx:idx + len(word)] == word[:]:
        cnt += 1
        idx += len(word)
    else:
        idx += 1

#for i in range(len(document)):
#    if document[:len(word)] == word[:]:
#        document = document[len(word):]
#        cnt += 1
#    else:
#        document = document[1:]

print(cnt)
#feat(Jeongmu-Jo): [BOJ, 1543] 문서 검색