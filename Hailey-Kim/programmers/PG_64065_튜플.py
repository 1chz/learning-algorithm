'''
Tuple
Given the string of number sets which can be made from a tuple,
return that tuple
01/2021
'''

def solution(s):
    updatedEl = []
    s = s.split('{')

    for i in s:
        new = []
        for j in i.split(','):
            if j != '':
                num = ''.join(k for k in j if k in '0123456789')
                new.append(int(num))
        if len(new) > 0:
            updatedEl.append(new)

    updatedEl.sort(key=lambda x: len(x))

    answer = []
    for i in updatedEl:
        for j in i:
            if j not in answer:
                answer.append(j)
    return answer