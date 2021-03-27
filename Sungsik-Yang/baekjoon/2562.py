num = []

for _ in range(9):
    num.append(int(input()))

max_num = max(num)

print(max(num))
print(num.index(max_num)+1)