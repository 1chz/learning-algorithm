# n = int(input())
# s = []
# for i in range(n):
#     st, end = map(int, input().split())
#     s.append([st, end])
#
# s = sorted(s, key=lambda a: a[0])
#
# s = sorted(s, key=lambda a: a[1])
#
#
# last = 0
# count = 0
# for i, j in s:
#     if i >= last:
#         count += 1
#         last = j
# print(count)
#



n = int(input())
s = []
for i in range(n):
    st, end = map(int, input().split())
    s.append([st, end])

s = sorted(s, key=lambda a: a[1])

s = sorted(s, key=lambda a: a[0])



front=0
end=0
count=0


for i,j in s:

    if front<i and j<=end:
        if i==end and j==end:
            count+=1
        front = i
        end = j
    elif i >=end :
        count+=1
        front=i
        end=j


print(count)