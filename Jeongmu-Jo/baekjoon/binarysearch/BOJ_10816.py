n = int(input())
num_cards = sorted(list(map(int, input().split())))
m = int(input())
m_list = list(map(int, input().split()))

dict = {}

for key_card in num_cards:
    if key_card in dict:
        dict[key_card] += 1
    else:
        dict[key_card] = 1 

#for key in m_list:
#    if key in dict:
#        print(dict[key], end = " ")
#    else:
#        print(0, end = " ")

print(' '.join(str(dict[key]) if key in dict else '0' for key in m_list))
#feat(Jeongmu-Jo): [BOJ, 10816] 숫자 카드2
