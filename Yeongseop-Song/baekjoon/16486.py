# boj 16486 운동장 한 바퀴 b4
# noj.am/16486

print((lambda x, y: 2 * x + 3.141592 * 2 * y)
      (*[int(input()) for _ in range(2)]))
