def longestCommonPrefix(strs):
    answer = ''
    strs.sort()

    for i in range(len(strs[0])):
        curr = strs[0][i]
        if includesCharacter(strs, curr, i):
            answer += curr
        else:
            break
    return answer

def includesCharacter(strs, curr, i):
    for x in strs[1:]:
        if x[i] == curr:
            continue
        else:
            return False
    return True