from itertools import product

class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        dic = {
            '2': ['a','b','c'],
            '3':['d','e','f'],
            '4':['g','h','i'],
            '5':['j','k','l'],
            '6':['m','n','o'],
            '7':['p','q','r','s'],
            '8':['t','u','v'],
            '9':['w','x','y','z']
        }

        if digits == "":
            return []
        
        digitsList = list(digits)
        candidates = []
        for x in digitsList:
            candidates.append(dic[x])

        combos = list(product(*candidates))
        answer = list(map(lambda x:''.join(x),combos))

        return answer      
        