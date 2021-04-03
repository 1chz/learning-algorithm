from itertools import combinations
from collections import Counter

def solution(orders, course):
    answer = []
    for k in course:
        candidates = []
        for menu in orders:
            for li in combinations(menu, k):
                res = ''.join(sorted(li))
                candidates.append(res)
        sorted_candidates = Counter(candidates).most_common()
        print(sorted_candidates)
        answer += [menu for menu, cnt in sorted_candidates if cnt > 1 and cnt == sorted_candidates[0][1]]
                
    return sorted(answer)

orders = ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]
course = [2,3,4]
print(solution(orders, course))