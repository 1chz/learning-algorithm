# boj 11948 과목선택 b4
# noj.am/11948

science = [int(input()) for _ in range(4)]
social = [int(input()) for _ in range(2)]

science.sort(reverse=True)
science.pop()
social.sort(reverse=True)
social.pop()

print(sum(science) + social[0])
