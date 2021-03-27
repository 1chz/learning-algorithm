odd = []
for _ in range(7):
    nums = int(input())
    if nums % 2 != 0:
        odd.append(nums)

if odd:
    print(sum(odd), min(odd))
else:
    print(-1)