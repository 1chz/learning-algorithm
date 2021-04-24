# iSharp
import re

string = input()
string_list = string.split(' ')

basic_type = string_list[0]
del string_list[0]

for s in string_list:
    s = s.replace(",", '').replace(";", '')
    print(basic_type, end='')

    for i in range(len(s)-1, 0, -1):
        if not s[i].isalpha():
            if s[i] == ']':
                print('[', end='')
            elif s[i] == '[':
                print(']', end='')
            else:
                print(s[i], end='')

    
    print(' ', end='')
    for i in range(len(s)):
        if s[i].isalpha():
            print(s[i], end='')

    print(';')