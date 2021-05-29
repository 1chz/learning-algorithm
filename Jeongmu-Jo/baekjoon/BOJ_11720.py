N = int(input())
nums = int(input())


ans = 0

for i in range(N):
    ans += nums%10
    nums = nums//10

print(ans)
#feat(Jeongmu-Jo): [BOJ, 11720] 숫자의 합