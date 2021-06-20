N = int(input())
num_lst = list(map(int, input().split()))
num_lst = sorted(num_lst)
M = int(input())
find_lst = list(map(int, input().split()))

def binary_search(start, end, search):
    if start > end:
        return 0
    midium = (start + end) // 2
    if search == num_lst[midium]:
        return 1
    elif search > num_lst[midium]:
        return binary_search(midium + 1, end, search)
    else:
        return binary_search(start, midium -1, search)

for i in find_lst:
    start = 0
    end = N-1
    print(binary_search(start, end, i), end = " ")
#feat(Jeongmu-Jo): [BOJ, 10815] 숫자 카드