# turn things to a graph : city -> vertex, flight -> edge
# price is to be stored in a heap queue (as I want to take the shortest price from the beginning)
# and price and the number of stops should be stored together (so we can check the maximum)
# As city should be visited only once, time: O((V + E)logV), space: O(V)

# Runtime: 92 ms, faster than 66.77% of Python3
# Memory Usage: 21.5 MB, less than 5.32% of Python3
from heapq import heappop, heappush
from collections import defaultdict


class Solution:
    def graph(self, flights: List[List[int]]) -> map:
        graph = defaultdict(list)
        for flight in flights:
            graph[flight[0]].append([flight[1], flight[2]])
        return graph

    def findCheapestPrice(self, n: int, flights: List[List[int]], src: int, dst: int, K: int) -> int:
        graph, candidate_q = self.graph(flights), [[0, src, 0]]
        while candidate_q:
            candidate = heappop(candidate_q)
            current_price, city, current_stop = candidate[0], candidate[1], candidate[2]
            if city == dst:
                return current_price
            if K < current_stop:
                continue

            for next_city in graph[city]:
                next_city_name, next_city_price = next_city[0], next_city[1]
                heappush(candidate_q, [current_price + next_city_price, next_city_name, current_stop + 1])

        return -1
