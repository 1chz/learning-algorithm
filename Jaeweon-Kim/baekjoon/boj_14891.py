wheels = [list(input().strip()) for _ in range(4)]
K = int(input())

def rotate(cur, direction):
    global answer
    if not checked[cur]:
        checked[cur] = True
        left_value = wheels[cur][6]
        right_value = wheels[cur][2]

        if direction == 1:
            temp = wheels[cur][7]
            for i in range(6, -1, -1):
                wheels[cur][i+1] = wheels[cur][i]
            wheels[cur][0] = temp
        else:
            temp = wheels[cur][0]
            for i in range(7):
                wheels[cur][i] = wheels[cur][i+1]
            wheels[cur][7] = temp

        if cur-1 >= 0 and left_value != wheels[cur-1][2]:
            rotate(cur-1, -direction)
        if cur+1 <= 3 and right_value != wheels[cur+1][6]:
            rotate(cur+1, -direction)


for i in range(K):
    checked = [False] * 4
    cur, direction = map(int, input().split())
    rotate(cur-1, direction)
count = 0
for i in range(4):
    if wheels[i][0] == '1':
        count += (2**i)

print(count)
