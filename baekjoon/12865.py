n,k=map(int,input().split())

w=[0]*101
v=[0]*101
dp=[[0 for i in range(100001)] for i in range(101)]



for i in range(1,n+1):
    w[i],v[i]=map(int,input().split())


for i in range(1,n+1): #넣을려는 물건
     for j in range(1,k+1): #배낭 최대무게
        if j>=w[i]: #들어갈 수 있다
         dp[i][j]=max(dp[i-1][j],dp[i-1][j-w[i]]+v[i])
        else:
            dp[i][j]=dp[i-1][j]

print(dp[n][k])
