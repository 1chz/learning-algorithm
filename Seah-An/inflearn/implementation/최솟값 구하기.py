arr = [5,2,7,9,2,5,2,6]

# 양의 무한대
arrMin = float('inf')
#음의 무한대
#negative = float('-inf')

# 1번 방법
for i in range(len(arr)):
    if arr[i] < arrMin:
        arrMin = arr[i]

# 2번 방법
for x in arr:
    if x < arrMin:
        arrMin = x

print(arrMin)