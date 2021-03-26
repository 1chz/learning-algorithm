# 뉴비의 기준은 뭘까?
n, m = map(int, input().split())
if(m <= 2):
    print("NEWBIE!")
elif(m <= n):
    print("OLDBIE!")
else:
    print("TLE!")