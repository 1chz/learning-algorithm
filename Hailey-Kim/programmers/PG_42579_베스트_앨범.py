'''
Best Album

Given the lists of genres and plays of the song i (same as the index of both lists),
return a list which has the i's of songs in the following order
1. list the songs in the most-played genres first
2. list the most-played song in each genre first
3. list the song with the lower i when multiple songs have the same number of plays in one genre
4. list max.2 songs from each genre

https://programmers.co.kr/learn/courses/30/lessons/42579
'''

def solution(genres, plays):
    s ={}
    answer = []
    sortGenre = {}
    
    #base set
    for i, g in enumerate(genres):
        s[g] = s.get(g,[]) + [[i, plays[i]]]
    
    # sort genres
    for k, v in s.items():
        sortGenre[k]=0
        for j in v:
            sortGenre[k] += j[1]
            
    sortGenre = dict(sorted(sortGenre.items(), key = lambda x: x[1], reverse = True))
        
    # complete answer        
    for i in sortGenre.keys():
        s[i].sort(key = lambda x: x[1], reverse = True)
        answer.append(s[i][0][0])
        if (len(s[i]) != 1):
            answer.append(s[i][1][0])
    return answer