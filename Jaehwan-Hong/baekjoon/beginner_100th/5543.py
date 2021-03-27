# 상근날드
bur1 = int(input())
bur2 = int(input())
bur3 = int(input())
bev1 = int(input())
bev2 = int(input())

combo1 = bur1 + min(bev1, bev2) - 50
combo2 = bur2 + min(bev1, bev2) - 50
combo3 = bur3 + min(bev1, bev2) - 50

print(min(combo1, combo2, combo3))

# bur = []
# bev = []
# for i in range(3):
#     k=int(input())
#     bur.append(k)
# for j in range(2):
#     t=int(input())
#     bev.append(t)
# print(min(bur) + min(bev) - 50)