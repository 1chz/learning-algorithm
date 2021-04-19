
def isConvertible(user_id, banned_id):
    if len(user_id) != len(banned_id):
        return False
    count = 0
    for i in range(len(user_id)):
        if banned_id[i] == '*' or banned_id[i] == user_id[i]:
            count += 1
        else:
            break
    if count == len(user_id):
        return True
        
from itertools import permutations
def solution(user_id, banned_id):
    answer = []
    n = len(banned_id)
    candidateCombos = list(permutations(user_id, n))
    
    for candidate in candidateCombos:
        count = 0
        for i, x in enumerate(candidate):
            if isConvertible(x, banned_id[i]):
                count += 1
        if count == n:
            candidate = list(candidate)
            candidate.sort()
            if candidate not in answer:
                answer.append(candidate)
    return len(answer)