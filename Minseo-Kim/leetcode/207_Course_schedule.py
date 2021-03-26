from collections import deque, defaultdict


# visiting order: (next, visit)
# topological algorithm O(V + E)
# Runtime: 92 ms, faster than 90.69% of Python3
# Memory Usage: 15.8 MB, less than 62.97% of Python3
class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        todo = {i: set() for i in range(numCourses)}
        graph = defaultdict(set)
        for i, j in prerequisites:
            todo[i].add(j)
            graph[j].add(i)
        candidate_q = deque([])
        for k, v in todo.items():
            if not v:
                candidate_q.append(k)
        while candidate_q:
            c = candidate_q.popleft()
            for next_c in graph[c]:
                todo[next_c].remove(c)
                if not todo[next_c]:
                    candidate_q.append(next_c)
            todo.pop(c)
        return not todo
