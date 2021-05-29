# https://www.acmicpc.net/problem/15873

a=input()
if len(a)==2:
    print(int (a[0])+int (a[1]))
elif len(a)==3:
    if int (a[-1])==0:
        print(10+int (a[0]))
    else:
        print(10+int(a[-1]))
else:
    print(20)