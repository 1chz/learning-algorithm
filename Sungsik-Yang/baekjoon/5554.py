time = 0
for _ in range(4):
    time += int(input())

min = time //60
sec = time % 60

print(min)
print(sec)