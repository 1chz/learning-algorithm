# boj 4949 균형잡힌 세상 s4
# noj.am/4949
import sys

inp = sys.stdin.readline

while True:
    input_data = inp().rstrip()
    if input_data == ".":  # 종료조건
        break
    stack = []
    for word in input_data:
        if word == "(" or word == "[":  # word == "(" or "[" 로 하면 인식 못하니 주의
            stack.append(word)
        elif word == ")":
            if len(stack) != 0 and stack[-1] == "(":  # ()짝이 맞춰지면 pop
                stack.pop()
            else:
                stack.append(word)  # 안맞춰지면 추가하고 끝내기
                break
        elif word == "]":
            if len(stack) != 0 and stack[-1] == "[":
                stack.pop()
            else:
                stack.append(word)
                break
    if len(stack) == 0:  # 스택이 비었으면 yes
        print("yes")
    else:
        print("no")
