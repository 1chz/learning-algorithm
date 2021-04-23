# 거북이

dx = [0,-1,0,1]
dy = [-1,0,1,0]

T = int(input())
for _ in range(T):
    pos_x, pos_y = 0, 0
    pos_dir = 0 # 0: 북, 1: 서, 2: 남, 3: 동
    move = list(input())
    trace = [(pos_x, pos_y)]
    for d in move:
        if d == 'F':
            pos_x = pos_x + dx[pos_dir]
            pos_y = pos_y + dy[pos_dir]
            trace.append((pos_x, pos_y))
        elif d == 'B':
            pos_x = pos_x - dx[pos_dir]
            pos_y = pos_y - dy[pos_dir]
            trace.append((pos_x, pos_y))
        elif d == 'L':
            if pos_dir == 3:
                pos_dir = 0
            else:
                pos_dir += 1
        elif d == 'R':
            if pos_dir == 0:
                pos_dir = 3
            else:
                pos_dir -= 1
        
    width = max(trace, key=lambda x:x[0])[0] - min(trace, key=lambda x:x[0])[0]
    height = max(trace, key=lambda x:x[1])[1] - min(trace, key=lambda x:x[1])[1]
    print(width * height)