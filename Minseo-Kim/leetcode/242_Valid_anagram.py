# 1st solution: sort each string and compare
# O(nlogn)
# 2nd solution: create a hash table and compare
# O(n)

from collections import Counter

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return sorted(s) == sorted(t)

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return Counter(s) == Counter(t)