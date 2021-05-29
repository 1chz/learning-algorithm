'''
Word Change

programmers.co.kr/learn/courses/30/lessons/66374 

You can only change a single alphabet in a word.
Given the starting word (begin), target word (target), and a list of possible words,
find the number of steps required to go from begin to target!


03/09/21
'''

# check if change from one word to another is possible
from collections import deque

def possible(start, target):
    for i in len(start):
        count = 0
        if start[i] != target[i]:
            count += 1
        if count == 2:
            return False
    return True

# solution
def solution(begin, target, words):
    visited = {begin: 0}  # number of steps req'd to reach each word

    q = deque([begin])

    while q:
        curr = q.popleft()
        for word in words:
            if word not in visited and possible(curr, word):
                visited[word] = visited[curr]+1
                q.append(word)

    if target in visited:
        return visited[target]
    return 0