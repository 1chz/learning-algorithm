N = int(input())
books = {}

for _ in range(N):
    book = input()
    if book not in books:
        books[book] = 1
    else:
        books[book] += 1

array = []

for key, value in books.items():
    if value == max(books.values()):
        array.append(key)

print(sorted(array)[0])
#feat(Jeongmu-Jo): [BOJ, 1302] 베스트셀러