str = input()

ucpc_list = ['U','C','P','C']
idx = 0

for word in ucpc_list:
    if word in str:
        idx += 1
        str = str[str.index(word)+1:]
    else:
        print('I hate UCPC')
        break
if idx == 4:
    print('I love UCPC')

#feat(Jeongmu-Jo): [BOJ, 15904] UCPC는 무엇의 약자일까?