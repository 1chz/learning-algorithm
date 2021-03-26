from collections import deque, defaultdict


# n courses from 0 to (n - 1)
# prerequisites[i] = [a, b] : a's prerequisite is b
# if possible: return ordering or courses (any)
# if impossible: return an empty arrayy
# topological algorithm: time complexity O(V + E)

# Runtime: 100 ms, faster than 66.47% of Python3
# Memory Usage: 15.7 MB, less than 56.36% of Python3
class Solution:
    def maps(self, prerequisites: List[List[int]]) -> map:
        to_visit_map, constraint_map = defaultdict(set), defaultdict(set)
        for visit, constraint in prerequisites:
            to_visit_map[visit].add(constraint)
            constraint_map[constraint].add(visit)
        return (to_visit_map, constraint_map)

    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        maps = self.maps(prerequisites)
        visited, candidate_q, to_visit_map, constraint_map = list(), deque(), maps[0], maps[1]

        for i in range(numCourses):
            if not to_visit_map[i]:
                candidate_q.append(i)
        while candidate_q:
            candidate = candidate_q.popleft()
            for next_c in constraint_map[candidate]:
                to_visit_map[next_c].remove(candidate)
                if not to_visit_map[next_c]:
                    candidate_q.append(next_c)
            constraint_map.pop(candidate)
            visited.append(candidate)
        if constraint_map:
            return []
        return visited
