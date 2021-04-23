# boj 17388 와글와글 숭고한 b4
# noj.am/17388

def pressure():
    college = ["Soongsil", "Korea", "Hanyang"]
    idx = Participation.index(min(Participation))
    return college[idx]


Participation = list(map(int, input().split()))
print("OK") if sum(Participation) >= 100 else print(pressure())
