# n, k = map(int, input().split())
# arr = []
# for i in range(1, n+1):
#     if n % i == 0:
#         arr.append(i)
# if k > len(arr):
#     print(0)
# else:
#     print(arr[k-1])


n,k = map(int, input().split())
for i in range(1, n+1):
    if n % i == 0:
        k -= 1
        if k == 0:
            print(i)
            exit()
print(0)