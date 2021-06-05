# boj 9012 괄호 s4
# noj.am/9012

for _ in range(int(input())):
    data = list(input())
    _stack = []
    for dt in data:
        if not _stack:
            _stack.append(dt)
        elif dt == "(":
            _stack.append(dt)
        elif dt == ")":
            if _stack[-1] == "(":
                _stack.pop()
            else:
                _stack.append(dt)
    if not _stack:
        print("YES")
    else:
        print("NO")