# O(n)
# Runtime: 292 ms, faster than 19.78% of Python3
# Memory Usage: 14.5 MB, less than 26.24% of Python3

# increase 'right' just before (right - left) does not equal (len(common) + k)
# ----> sliding window's size should be*right - left*

# Once you decide temporary sliding window's size...
# if the window does not meet the 'k' + common = length condition: move left &right
# else: keep moving left & update the result(sliding window's size)

from collections import Counter


class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        if len(s) < 2:
            return len(s)

        left, counter = 0, Counter(s[0])

        for right in range(1, len(s)):
            counter[s[right]] += 1
            if counter.most_common(1)[0][1] + k < right - left + 1:
                counter[s[left]] -= 1
                left += 1

        return right - left + 1
v