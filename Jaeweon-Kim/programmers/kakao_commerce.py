# practice 1
from copy import deepcopy
from itertools import permutations

def solution(gift_cards, wants):
    answer = 1000001
    size = len(gift_cards)
    mix_cards = []
    for li in permutations(gift_cards, 5):
        mix_cards.append(li)
    
    for li in mix_cards:
        cnt = 0
        for i in range(size):
            if li[i] != wants[i]:
                cnt += 1
        answer = min(answer, cnt)
    
    return answer

gift_cards = [4,5,3,2,1]
wants = [2,4,4,5,1]
print(solution(gift_cards, wants))

# practice 2
from itertools import combinations
def solution(needs, r):
    answer = 0
    size = len(needs)
    tools = [i for i in range(size)]
    robots = combinations(tools, r)
    for parts in robots:
        cnt = 0
        for need in needs:
            approved = 0
            one = 0
            for i in range(len(need)):
                if need[i] == 1:
                    one += 1
                if need[i] == 1 and i in parts:
                    approved += 1
            if approved == one:
                cnt += 1
        answer = max(answer, cnt)
    return answer

needs = [[1, 0, 0], [1, 1, 0], [1, 1, 0], [1, 0, 1], [1, 1, 0], [0, 1, 1]]
r = 2
print(solution(needs, r))

