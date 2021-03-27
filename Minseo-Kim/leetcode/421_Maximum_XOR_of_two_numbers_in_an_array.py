# Defintion: 1 XOR 0 -> 1, 0 XOR 0 -> 0, 1 XOR 1 -> 0
# 1st solution: nC2 O(n^2) --> Time Limit Exceeded
class SlowSolution:
    def findMaximumXOR(self, nums: List[int]) -> int:
        result = 0
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                temp = nums[i] ^ nums[j]
                if result < temp:
                    result = temp
        return result


# 2nd solution: O(n)
# Runtime: 1032 ms, faster than 43.69% of Python3
# Memory Usage: 69.4 MB, less than 5.37% of Python3
from collections import defaultdict


class TrieNode:
    def __init__(self):
        self.val = None
        self.children = defaultdict(TrieNode)


class Trie:
    def __init__(self):
        self.root = TrieNode()

    def insert(self, word: str, val: int) -> None:
        node = self.root
        for char in word:
            node = node.children[int(char)]
        node.val = val

    def find_xor_max_val(self, min_node: TrieNode, max_node: TrieNode) -> int:
        if min_node is None and max_node is None:
            pointer_min, pointer_max = self.root, self.root
        else:
            pointer_min, pointer_max = min_node, max_node

        while pointer_min.children and pointer_max.children:
            if len(pointer_max.children) == len(pointer_min.children) == 2:
                comb1 = self.find_xor_max_val(pointer_max.children[1], pointer_min.children[0])
                comb2 = self.find_xor_max_val(pointer_max.children[0], pointer_min.children[1])
                return max(comb1, comb2)
            elif len(pointer_max.children) < len(pointer_min.children):
                val = 0
                if 1 in pointer_max.children:
                    val = 1
                pointer_max = pointer_max.children[val]
                pointer_min = pointer_min.children[1 - val]
            else:
                val = 0
                if 1 in pointer_min.children:
                    val = 1
                pointer_min = pointer_min.children[val]
                if 1 - val in pointer_max.children:
                    pointer_max = pointer_max.children[1 - val]
                else:
                    pointer_max = pointer_max.children[val]

        return pointer_min.val ^ pointer_max.val


class Solution:
    def findMaximumXOR(self, nums: List[int]) -> int:
        if len(nums) < 2:
            return 0
        binary_digits, trie = len(bin(max(nums))) - 2, Trie()
        for i in nums:
            binary_str = bin(i).replace('0b', "").rjust(binary_digits, "0")
            trie.insert(binary_str, i)

        return trie.find_xor_max_val(None, None)