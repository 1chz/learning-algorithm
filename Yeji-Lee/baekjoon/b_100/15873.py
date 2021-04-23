# 공백 없는 A + B
a = input()
if(len(a) == 2):
    print(int(a[0]) + int(a[1]))
elif(len(a) == 3):
    print(int(a[0:2]) + int(a[2]) if(a[0:2] == '10') else int(a[0]) + int(a[1:]))
else:
    print(20)