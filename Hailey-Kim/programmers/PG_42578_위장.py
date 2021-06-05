'''
Disguise
Given the list of clothing list([clothing_name, clothing_type]),
return the number of different combinations that a spy can wear.
01/2021
'''

def solution(clothes):
    hashTable = {}
    answer = 1
    
    for i in clothes:
        category = hash(i[1])
        if category in hashTable:    
            hashTable[category] += 1
        else:
            hashTable[category] = 1
    
    for v in hashTable.values():
        answer *= (v+1)
    
    # the case where no clothes is worn
    answer -= 1 
    return answer