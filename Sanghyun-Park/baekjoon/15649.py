import sys

N,M=map(int,sys.stdin.readline().split())

arr=[i for i in range(1,N+1)]

def n_m(arr_1,m,c_n):
    arr_2=[]+arr_1
    c_n_2=c_n
    if m==1:
        for j in arr_1:
            print(c_n,j,sep=' ')
    else:
        for i in arr_2:
            arr_1=[]+arr_2
            c_n=c_n_2
            arr_1.remove(i)
            if c_n=='':
                c_n=str(i)
            else:
                c_n+=' '+str(i)

            n_m(arr_1,m-1,c_n)

if M==1:
    for i in arr:
        print(i)
else:
    n_m(arr,M,'')