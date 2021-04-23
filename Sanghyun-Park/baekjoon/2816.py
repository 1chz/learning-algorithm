import sys

N=int(sys.stdin.readline())

count1=0
count2=0

for i in range(N):
    wd= str(sys.stdin.readline().replace('\n',''))
    if wd == 'KBS1':
        count1=i
    if wd == 'KBS2':
        count2=i


def print1(pos):
    return('1'*(pos)+'4'*(pos))


if count2==0:
    print(print1(count1))
elif count1<count2:
    print(print1(count1),'1'+print1(count2-1),sep='')
else:
    print(print1(count1),'1'+print1(count2),sep='')



