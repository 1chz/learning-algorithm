# O(n) / O(n) solution
# Runtime: 52 ms, faster than 80.85% of Python3
# Memory Usage: 15.2 MB, less than 7.64% of Python3
class Solution:
    def trap(self, height: List[int]) -> int:

        left_max_list, right_max_list = [0 * i for i in range(len(height))], [0 * i for i in range(len(height))]
        for i in range(1, len(height)):
            left_max_list[i] = max(left_max_list[i - 1], height[i - 1])
        for i in range(len(height) - 2, -1, -1):
            right_max_list[i] = max(right_max_list[i + 1], height[i + 1])

        volume = 0
        for i in range(1, len(height) - 1):
            h = height[i]
            if h < left_max_list[i] and h < right_max_list[i]:
                temp_volume = min(left_max_list[i], right_max_list[i]) - h
                volume += temp_volume

        return volume


# O(n) / O(1) solution with two pointers
# Runtime: 48 ms, faster than 92.31% of Python3
# Memory Usage: 14.9 MB, less than 36.21% of Python3
class Solution:
    def trap(self, height: List[int]) -> int:
        if not height:
            return 0

        volume = 0
        max_left, max_right = height[0], height[len(height) - 1]
        left, right = 1, len(height) - 1

        while left <= right:
            if max_left < max_right:
                max_left = max(max_left, height[left])
                if 0 < min(max_left, max_right) - height[left]:
                    volume += min(max_left, max_right) - height[left]
                left += 1

            else:
                max_right = max(max_right, height[right])
                if 0 < min(max_left, max_right) - height[right]:
                    volume += min(max_left, max_right) - height[right]
                right -= 1

        return volume
