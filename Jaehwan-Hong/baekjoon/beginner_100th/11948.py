# 과목선택
a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())
f = int(input())

arr1 = [a, b, c, d]
arr1.sort(reverse=True)
arr2 = [e, f]

print(sum(arr1[0:3]) + max(arr2))
#print(sum(arr1) - min(arr1) + max(arr2))

# a = [int(input()) for i in range(4)]
# b = [int(input()) for i in range(2)]
# print(sum(a) - min(a) + max(b))