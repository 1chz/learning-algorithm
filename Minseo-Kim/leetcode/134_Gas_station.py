# 1st solution) Brute force: O(n^2) time complexity
class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        n = len(gas)
        remainder = [gas[i] - cost[i] for i in range(n)]
        if sum(remainder) < 0:
            return -1
        for i, v in enumerate(remainder):
            if (v < 0):
                continue
            storage = 0
            for j in range(i, i + n):
                if j < n:
                    storage += remainder[j]
                else:
                    storage += remainder[j - n]
                if storage < 0:
                    break
            if 0 <= storage:
                return i
        return -1

# O(n) solution. 전형적인 Greedy 문제. remainder sum 이 일단 0보다 크다면, 무조건 답이 존재하므로.
class Solution:
    def canCompleteCircuit(self, gas: List[int], cost: List[int]) -> int:
        n, storage, current_index = len(gas), 0, 0
        remainder = [gas[i] - cost[i] for i in range(n)]
        if sum(remainder) < 0:
            return -1
        print(remainder)
        for i, v in enumerate(remainder):
            storage += v
            if storage < 0:
                storage, current_index = 0, i + 1

        return current_index