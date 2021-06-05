import sys

input = sys.stdin.readline

# 문제에 주어진 예제 케이스는 다 통과하는데
# 틀렸다고 계속 뜹니다
# 반례가 뭘까요...ㅎ

while True:
    sentence = input().rstrip()
    stack = []
    # flag가 여전히 True이면 균형 조건에 만족한것
    # False로 바뀌면 조건 실패함
    flag = True
    # .이 탈출조건
    if sentence == '.':
        break

    for i in sentence:
        # 만약 ( 나 [ 라면 스택에 추가해라
        if i == '(' or i == '[':
            stack.append(i)
        elif i == ')':
            # 만약 stack이 비어있고, 최근에 스택에 들어온 값이 '['이라면
            if not stack or stack[-1] == '[':
                # flag의 값을 False로 하고
                flag = False
                # 빠져나와라
                break
            # 만약 stack에 최근에 넣은 값이 '('이라면 짝을 이루므로
            elif stack[-1] == '(':
                # 최근의 (을 꺼내서 없애라
                stack.pop()
        # 만약 ]라면
        elif i == ']':
            # 스택에 쌓인 값이 없거나 스택에 최근 넣은 값이 ( 라면
            if not stack or stack[-1] == '(':
                flag = False
                # 나와라
                break
            # 스택에 최근 넣은 값이 [이라면
            elif stack[-1] == '[':
                # 꺼내서 없애라
                stack.pop()
    # 만약 flag의 값이 여전히 True이고 스택이 비어있다면
    if flag == True and not stack:
        # YES를 출력해라
        print('yes')
    # 그렇지 않다면
    else:
        # NO를 출력해라
        print('no')
