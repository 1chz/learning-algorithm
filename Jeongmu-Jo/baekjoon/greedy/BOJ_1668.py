N = int(input())
lst = [int(input()) for _ in range(N)]

def finding(lst):
    now = lst[0]
    result = 1
    for i in range(1, len(lst)):
        if now < lst[i]:
            result += 1
            now = lst[i]
    return result

print(finding(lst))
lst = lst[::-1]
print(finding(lst))
#feat(Jeongmu-Jo): [BOJ, 1668] 트로피 진열