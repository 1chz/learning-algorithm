import sys


L,C=map(int,sys.stdin.readline().split())

let=list(sys.stdin.readline().split())

let=sorted(let)

count1=0
count2=0

check=['a','e','i','o','u']

def mk_wd(c_w,arr,count1,count2):
    temp=c_w
    temp_c1=count1
    temp_c2=count2
    for i,val in enumerate(arr):
        c_w=temp
        count1=temp_c1
        count2=temp_c2
        if val in check:
            count1+=1
            c_w=c_w+val
        else:
            count2+=1
            c_w=c_w+val

        if len(c_w)==L:
            if count1<1 or count2<2:
                pass
            else:
                print(c_w)

        else :
            if i+1<=C-1:
                mk_wd(c_w,arr[i+1:],count1,count2)



mk_wd('',let,count1,count2)






