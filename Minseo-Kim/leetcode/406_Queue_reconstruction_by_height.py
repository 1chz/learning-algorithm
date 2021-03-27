# time: O(nlogn) solution, space: O(n)
# Runtime: 540 ms, faster than 17.40% of Python3
# Memory Usage: 15 MB, less than 7.18% of Python3
from heapq import heapify, heappop

class SlowSolution:
    def reconstructQueue(self, people: List[List[int]]) -> List[List[int]]:
        result, order_heap_q = list(), list()
        order_heap_q = [[sub[1], sub[0]] for sub in people]

        heapify(order_heap_q)

        while order_heap_q:
            person = heappop(order_heap_q)
            person_order, person_height = person[0], person[1]
            temp_order, index_num = 0, len(result)
            for i in range(len(result)):
                if person_height <= result[i][0]:
                    temp_order += 1
                if temp_order == person_order + 1:
                    index_num = i
                    break
            result.insert(index_num, [person_height, person_order])

        return result


# time: O(nlogn) solution, space: O(n)
# Runtime: 96 ms, faster than 69.71% of Python3
# Memory Usage: 15 MB, less than 7.18% of Python3
class Solution:
    def reconstructQueue(self, people: List[List[int]]) -> List[List[int]]:
        result, people = list(), [[sub[0], sub[1]] for sub in people]
        people.sort(reverse=True, key=lambda x: (x[0], -x[1]))

        for person in people:
            result.insert(person[1], person)

        return result