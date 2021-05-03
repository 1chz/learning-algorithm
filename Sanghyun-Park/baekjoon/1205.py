n,score,p=map(int,input().split())

if n==0:
    print(1)
else:
    score_1=list(map(int,input().split()))
    if n==p and score_1[-1]>=score:
        print(-1)
    else:
        res=n+1
        for i in range(n):
            if score_1[i]<=score:
                res=i+1
                break

        print(res)