import sys

N=int(sys.stdin.readline())

prime=[1]*1030001

for i in range(2,int(1030000**(0.5))+1):
    if prime[i] ==0:
        continue
    for j in range(2,1030000//i+1):
        prime[i*j]=0

def check(k):
    wd=str(k)
    leng=len(wd)

    if leng%2==0: #짝수
        for i in range(leng//2):
            if wd[i]==wd[leng-1-i]:
                continue
            else:
                return False
        return True
    else:
        for i in range(leng//2):
            if wd[i]==wd[leng-1-i]:
                continue
            else:
                return False
        return True



prime[1]=0
for k in range(N,1040001):
    if prime[k] and check(k):
        print(k)
        break


