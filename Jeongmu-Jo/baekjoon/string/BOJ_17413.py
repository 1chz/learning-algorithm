S, tmp = input(), ""

ck = False

for i in S:
    if i == ' ':
        if not ck:
            print(tmp[::-1], end = " ")
            tmp = ""
        else:
            print(" ", end = "")
    elif i == '<':
        ck = True
        print(tmp[::-1] + "<", end = "")
        tmp = ""
    elif i == '>':
        ck = False
        print('>', end = "")
    else:
        if ck:
            print(i, end = "")
        else:
            tmp += i
print(tmp[::-1])

#for i in S:
 #   tmp += i
#print(tmp[::-1])


#feat(Jeongmu-Jo): [BOJ, 17413] 문자열 뒤집기 2