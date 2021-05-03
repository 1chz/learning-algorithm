# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# O(n) / O(logn) solution

# Runtime: 60 ms, faster than 79.17% of Python3
# Memory Usage: 15.6 MB, less than 78.26% of Python3
class Solution:
    def sortedArrayToBST(self, nums: List[int]) -> TreeNode:
        if len(nums) == 1:
            return TreeNode(nums[0])

        mid = len(nums) // 2
        root = TreeNode(nums[mid])

        if 0 < mid:
            root.left = self.sortedArrayToBST(nums[:mid])
        if mid + 1 < len(nums):
            root.right = self.sortedArrayToBST(nums[mid + 1:])
        return root