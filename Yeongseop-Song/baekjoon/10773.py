# boj 10773 제로 s4
# noj.am/10773

K = int(input())
_stack = []  # 스택 선언

for i in range(K):
    _int = int(input())
    if _int == 0:  # 입력값이 0이면 pop
        _stack.pop()
    else:  # 입력값이 0이 아니면 입력값 push
        _stack.append(_int)

print(sum(_stack))  # 스택의 합 출력
