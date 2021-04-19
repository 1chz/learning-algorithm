# 순위 검색
from copy import deepcopy
from bisect import bisect_left
cases = []
temp_cases = []
def make_cases():
    if len(temp_cases) == 4:
        cases.append(deepcopy(temp_cases))
        return

    for i in (False, True):
        temp_cases.append(i)
        make_cases()
        temp_cases.pop()

def replace(case, data):
    for i in range(4):
        if case[i]:
            data[i] = '-'
    return data

def binary_search(info_dict, score):
    size = len(info_dict)
    return size - bisect_left(info_dict, score, lo=0, hi=size)

def solution(info, query):
    answer = []
    info_dict = {}
    make_cases()

    for data in info:
        data = data.split()
        score = int(data[-1])
        data = data[:4]
        for case in cases:
            _data = deepcopy(data)
            _data = replace(case, _data)
            _data = ''.join(_data)

            if _data not in info_dict.keys():
                info_dict[_data] = [score]
            else:
                info_dict[_data].append(score)

    for key in info_dict.keys():
        info_dict[key].sort()

    for q in query:
        q = q.split()
        score = int(q[-1])
        _q = ''

        for item in q[:len(q) - 1]:
            if item != 'and':
                _q += item
        
        if _q not in info_dict.keys():
            answer.append(0)
        else:
            answer.append(binary_search(info_dict[_q], score))

    return answer