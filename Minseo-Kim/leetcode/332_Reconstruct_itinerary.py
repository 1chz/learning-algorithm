from collections import defaultdict
# O(nlogn) solution
# Runtime: 56 ms, faster than 100.00% of Python3
# Memory Usage: 14.6 MB, less than 74.86% of Python3

class Solution:
    def iternary_map(self, tickets: list) -> map:
        graph = defaultdict(list)
        for ticket in sorted(tickets, reverse=True):
            graph[ticket[0]].append(ticket[1])
        return graph

    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        result_list = list()
        graph = self.iternary_map(tickets)
        print(graph)

        def next_ticket(ticket: str) -> None:
            # append 는 여기가 아니라
            while graph[ticket]:
                next_ticket(graph[ticket].pop())
            # 여기서 하는데, 끝까지 갔다가 돌아와야 하므로.
            result_list.append(ticket)

        next_ticket("JFK")

        return result_list[::-1]
