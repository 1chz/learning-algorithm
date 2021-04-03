from collections import defaultdict, deque

# topological solution
# O(V + E)

class Solution:
    def vertice_dict(self, edges: List[List[int]]) -> map:
        vertice_dict = defaultdict(list)
        for edge in edges:
            vertice_dict[edge[0]].append(edge[1])
            vertice_dict[edge[1]].append(edge[0])
        return vertice_dict

    def findMinHeightTrees(self, n: int, edges: List[List[int]]) -> List[int]:
        if not edges:
            return [0]

        to_visit, vertice_dict, queue = 0, self.vertice_dict(edges), deque([])

        if len(vertice_dict.keys()) <= 2:
            return vertice_dict.keys()

        for k, v in vertice_dict.items():
            if len(v) == 1:
                queue.append(k)

        while to_visit < n - 2:
            next_queue = deque()
            while queue:
                k = queue.popleft()
                v_list = vertice_dict[k]
                vertice_dict.pop(k)
                to_visit += 1

                for v in v_list:
                    vertice_dict[v].remove(k)
                    if len(vertice_dict[v]) == 1:
                        next_queue.append(v)
            queue = next_queue

        return list(queue)