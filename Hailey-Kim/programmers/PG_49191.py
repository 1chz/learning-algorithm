'''
Boxing Rank

Provided the list of winner-loser data ,
return the number of players whose ranks can be determined.


programmers.co.kr/learn/courses/30/lessons/49191
'''

def solution(n, results):
    answer = 0
    # list of players i won
    wins = {}
    # list of players i lost
    loses = {}
    
    for i in range(1, n+1):
        wins[i] = set()
        loses[i] = set()
    
    for x,y in results:
        wins[x].add(y)
        loses[y].add(x)
        
    # players that won i (loses[i])
    # win the players that lost i (wins[i])
    # vice-versa
    for i in range(1, n+1):
        for winner in loses[i]:
            wins[winner].update(wins[i])
        for loser in wins[i]:
            loses[loser].update(loses[i])
        
    
    for i in range(1, n+1):
        if len(wins[i]) + len(loses[i]) ==n-1:
            answer += 1
    return answer