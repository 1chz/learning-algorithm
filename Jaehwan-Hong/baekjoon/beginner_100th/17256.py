# 달달함이 넘쳐흘러
# az + bx = cx
# ay * by = cy
# ax + bz = cz
ax, ay, az = map(int, input().split())
cx, cy, cz = map(int, input().split())
bx = cx - az
by = cy // ay
bz = cz - ax
print(bx, by, bz)