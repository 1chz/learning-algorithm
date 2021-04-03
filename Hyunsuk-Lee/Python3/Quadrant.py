x = int(input())
y = int(input())

if x > 0:
    if y > 0:
        quadrant = 1
    else:
        quadrant = 4
else:
    if y > 0:
        quadrant = 2
    else:
        quadrant = 3
print(quadrant)
