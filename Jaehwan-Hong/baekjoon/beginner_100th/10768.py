# 특별한 날
from datetime import datetime
t1 = datetime(2015, int(input()), int(input()))
t2 = datetime(2015, 2, 18)

if(t1 < t2):
    print("Before")
elif(t1 == t2):
    print("Special")
else:
    print("After")