'''
Course Schedule

06/02/2021
'''

class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        # Establish a dictionary
        ref = [[] for _ in range(numCourses)]
        for a, b in prerequisites:
            ref[a].append(b)
        
        visited = [0] * numCourses
        
        # explore each node and see if any cycle is found
        for i in range(numCourses):
            if not self.dfs(ref, visited, i):
                return False
        return True
    
  
    def dfs(self, ref, visited, i):
        # -1: being visited
        # 1: visited
        if visited[i] == -1:
            return False
        if visited[i] == 1:
            return True
        
        visited[i] = -1
        
        for j in ref[i]:
            if not self.dfs(ref, visited, j):
                # if cycle is found
                return False
        visited[i] = 1
        
        return True