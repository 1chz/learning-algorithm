# 괄호의 값
strs = list(input().strip())
stack = []
result = 0

for s in strs:
    temp = 0
    if s == ')':
        while len(stack) != 0:
            top = stack.pop()
            if top == '(':
                if temp == 0:
                    stack.append(2)
                else:
                    stack.append(2 * temp)
                break
            elif top == '[':
                print(0)
                exit(0)
            else:
                temp += int(top)
    elif s == ']':
        while len(stack) != 0:
            top = stack.pop()
            if top == '[':
                if temp == 0:
                    stack.append(3)
                else:
                    stack.append(3 * temp)
                break
            elif top == '(':
                print(0)
                exit(0)
            else:
                temp += int(top)
    else:
        stack.append(s)

for i in stack:
    if i == '(' or i == '[':
        print(0)
        exit(0)
    else:
        result += i
print(result)