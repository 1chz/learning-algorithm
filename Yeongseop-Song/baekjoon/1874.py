# boj 1874 스택 수열 
# noj.am/1874

n = int(input())
_stack = []
res = []
cnt = 0
flag = True
for _ in range(n):
    _input = int(input())
    while cnt < _input:
        cnt += 1
        _stack.append(cnt)
        res.append("+")
    if _stack[-1] == _input:
        _stack.pop()
        res.append("-")
    else:
        flag = False

print('\n'.join(res)) if flag else print("NO")