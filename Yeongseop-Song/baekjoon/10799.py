# boj 10799 쇠막대기 s3
# noj.am/10799

import sys

_str = list(sys.stdin.readline().rstrip())
_stack = []
cnt = 0

for i in range(len(_str)):
    if _str[i] == "(":
        _stack.append(_str[i])
    else:  # ')' 라면
        if _str[i-1] == "(":  # 그전의 원소가 '(' 라면 ()이므로 스택에 있는 ( 갯수만큼 +
            _stack.pop()
            cnt += len(_stack)
        else:  # )라면 pop하고 1개 추가
            _stack.pop()
            cnt += 1

print(cnt)