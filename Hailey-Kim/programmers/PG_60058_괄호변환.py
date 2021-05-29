'''
Parentheses Test
programmers.co.kr/learn/courses/30/lessons/60058

Fix the parenthese in the given string s
03/08/21
'''

# 균형잡힌 괄호 문자열의 인덱스 반환


def balanced_index(p):
    count = 0  # 왼쪽 괄호의 개수
    for i in range(len(p)):
        if p[i] == '(':
            count += 1
        else:
            count -= 1
        if count == 0:
            return i

# 올바른 괄호 문자열인 지 확인


def check_proper(p):
    count = 0  # 왼쪽 괄호의 개수
    for i in p:
        if i == '(':
            count += 1
        else:
            if count == 0:
                return False
            else:
                count -= 1

    return True

# solution 함수


def solution(p):
    answer = ''
    # 1. if empty, return empty string
    if p == '':
        return answer
    # 2. split into two 'balanced parentheses string'
    index = balanced_index(p)
    u = p[:index+1]
    v = p[index+1:]
    # 3. if u is 'proper p str' apply Step 1~ to v
    if check_proper(u):
        answer = u + solution(v)

    # 4. if not,
    # 4-1. add '(' to answer
    else:
        answer = '('
        # 4-2. apply Step 1~ to v
        answer += solution(v)
        # 4-3. add ')' to answer
        answer += ')'
        # 4-4. remove the first and last letters of u,
        # and add the flipped parentheses of the remainig string
        for j in u[1:-1]:
            if j == '(':
                answer += ')'
            else:
                answer += '('
    return answer
