import sys
t = int(sys.stdin.readline().strip())
for i in range(0, t):
    n = int(sys.stdin.readline().strip())
    grades = []
    for j in range(0, n):
        grades.append(list(map(int, sys.stdin.readline().strip().split())))
    grades.sort(key=lambda x: x[0])
    count = n
    bound = grades[0][1]
    for k in range(1, n):
        if grades[k][1] > bound: 
            count -= 1
        bound = min(bound, grades[k][1])
    print(count)