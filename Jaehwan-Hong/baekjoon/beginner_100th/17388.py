# 와글와글 숭고한
s = list(map(int, input().split()))
if(sum(s) >= 100):
    print("OK")
else:
    if(min(s) == s[0]):
        print("Soongsil")
    elif(min(s) == s[1]):
        print("Korea")
    else:
        print("Hanyang")