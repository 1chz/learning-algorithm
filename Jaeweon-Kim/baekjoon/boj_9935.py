# 문자열 폭발

string = input()
bomb = input()
length = len(bomb)

last_char = bomb[-1]
stack = []

for char in string:
    stack.append(char)
    if char == last_char and ''.join(stack[-length:]) == bomb:
        del stack[-length:]

answer = ''.join(stack)
if answer == '':
    print("FRULA")
else:
    print(answer)