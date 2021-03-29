# time complexity: O(n) # space complexity: O(n)
# Runtime: 216 ms, faster than 21.47% of Python3
# Memory Usage: 14.5 MB, less than 6.59% of Python3
from collections import defaultdict


class Solution:

    def clean_dict(self, d: map, index: int) -> None:
        to_be_deleted = list()
        for k, v in d.items():
            if v <= index:
                to_be_deleted.append(k)

        for k in to_be_deleted:
            d.pop(k)

    def lengthOfLongestSubstring(self, s: str) -> int:
        max_len, temp_len, index_table = 0, 0, defaultdict(int)
        for i, start_char in enumerate(s):
            if start_char not in index_table.keys():
                index_table[start_char] = i
                temp_len += 1
            else:
                max_len = max(max_len, temp_len)
                dup_index = index_table[start_char]
                self.clean_dict(index_table, dup_index)
                index_table[start_char] = i
                temp_len = len(index_table.keys())

        max_len = max(max_len, temp_len)
        return max_len3_Lo


# Optimal Solution

# time complexity: O(n) # space complexity: O(n)

# Runtime: 60 ms, faster than 75.13% of Python3
# Memory Usage: 14.4 MB, less than 56.01% of Python3
from collections import defaultdict


class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if not s:
            return 0
        max_len, temp_start, index_table = 0, 0, defaultdict(int)
        for i, start_char in enumerate(s):
            if start_char in index_table.keys() and temp_start <= index_table[start_char]:
                temp_start = index_table[start_char] + 1

            index_table[start_char] = i
            max_len = max(max_len, i - temp_start + 1)
        return max_len
