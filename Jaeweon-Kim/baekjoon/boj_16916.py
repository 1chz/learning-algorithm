# 부분 문자열 (kmp 알고리즘)

def make_table():
    size = len(p)
    table = [0] * len(p)
    j = 0
    for i in range(1, size):
        while j > 0 and p[i] != p[j]:
            j = table[j-1]
        if p[i] == p[j]:
            j += 1
            table[i] = j
    return table

def kmp():
    table = make_table()
    j = 0
    for i in range(len(s)):
        while j > 0 and s[i] != p[j]:
            j = table[j-1]
        if s[i] == p[j]:
            if j == len(p) - 1:
                return True
            else:
                j += 1
    return False

s = input()
p = input()
print(1 if kmp() else 0)