import sys


while True:
    try:
        x=int(sys.stdin.readline())*10000000
        n=int(sys.stdin.readline())

        lego={}
        x_1=0
        y_1=0
        count=0
        for i in range(n):
            num=int(sys.stdin.readline())
            if num in lego.keys():
                lego[num][1]+=1
            else:
                lego[num]=[x-num,1]

        for i in lego.keys():
            if lego[i][0] in lego.keys() and int(i)!=lego[i][0]:
                if abs(x_1 - y_1) < abs(lego[i][0] - int(i)):
                    x_1 = lego[i][0]
                    y_1 = int(i)
                    count=1
            elif count==0 and int(i)==lego[i][0] and lego[i][1]>1:
                x_1 = lego[i][0]
                y_1 = int(i)

        if x_1!=0:
            print('yes',min(x_1,y_1),max(x_1,y_1),sep=' ')
        else:
            print('danger')
    except:
        break

