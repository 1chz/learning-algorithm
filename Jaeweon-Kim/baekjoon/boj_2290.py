s, n = input().split()
s = int(s)
col, row = 2*s+3, s+2
def one(s):
    global text
    for i in range(col):
        if i in (0, s+1, col-1):
            text[i] += ' '*row
        else:
            text[i] += ' ' * (row-1) + '|'
    return text

def two(s):
    global text
    for i in range(col):
        if i in (0, s+1, col-1):
            text[i] += ' ' + '-'*s + ' '
        else:
            if i < s+1:
                text[i] += ' ' * (row-1) + '|'
            else:
                text[i] += '|' + ' ' * (row-1)
    return text

def three(s):
    global text
    for i in range(col):
        if i in (0, s+1, col-1):
            text[i] += ' ' + '-'*s + ' '
        else:
            text[i] += ' ' * (row-1) + '|'
    return text

def four(s):
    global text
    for i in range(col):
        if i in (0, col-1):
            text[i] += ' '*row
        elif i == s+1:
            text[i] += ' ' + '-'*s + ' '
        else:
            if i < s+1:
                text[i] += '|' + ' ' * s + '|'
            else:
                text[i] += ' ' * (row-1) + '|'
    return text

def five(s):
    global text
    for i in range(col):
        if i in (0, s+1, col-1):
            text[i] += ' ' + '-'*s + ' '
        else:
            if i < s+1:
                text[i] += '|' + ' ' * (row-1)
            else:
                text[i] += ' ' * (row-1) + '|'
    return text

def six(s):
    global text
    for i in range(col):
        if i in (0, s+1, col-1):
            text[i] += ' ' + '-'*s + ' '
        else:
            if i < s+1:
                text[i] += '|' + ' ' * (row-1)
            else:
                text[i] += '|' + ' ' * s + '|'
    return text

def seven(s):
    global text
    for i in range(col):
        if i == 0:
            text[i] += ' ' + '-'*s + ' '
        elif i in (s+1, col-1):
            text[i] += ' '*row
        else:
            text[i] += ' ' * (row-1) + '|'
    return text

def eight(s):
    global text
    for i in range(col):
        if i in (0, s+1, col-1):
            text[i] += ' ' + '-'*s + ' '
        else:
            text[i] += '|' + ' ' * s + '|'
    return text

def nine(s):
    global text
    for i in range(col):
        if i in (0, s+1, col-1):
            text[i] += ' ' + '-'*s + ' '
        else:
            if i < s+1:
                text[i] += '|' + ' ' * s + '|'
            else:
                text[i] += ' ' * (row-1) + '|'
    return text

def zero(s):
    global text
    for i in range(col):
        if i in (0, col-1):
            text[i] += ' ' + '-'*s + ' '
        elif i == s+1:
            text[i] += ' '*row
        else:
            text[i] += '|' + ' ' * s + '|'
    return text

text = [''] * col
func_dict = {
    '0': zero,
    '1': one,
    '2': two,
    '3': three,
    '4': four,
    '5': five,
    '6': six,
    '7': seven,
    '8': eight,
    '9': nine
}
def run(number):
    func_dict[number](s)
    for i in range(col):
        text[i] += ' '

for i in n:
    run(i)

for i in text:
    print(i)