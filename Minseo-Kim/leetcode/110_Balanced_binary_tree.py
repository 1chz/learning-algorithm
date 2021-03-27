# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# Runtime: 52 ms, faster than 63.37% of Python3
# Memory Usage: 19.3 MB, less than 20.79% of Python3

# O(n), O(n)

class Solution:
    def isBalanced(self, root: TreeNode) -> bool:
        def height(root: TreeNode) -> int:
            if not root:
                return -1
            left = height(root.left) + 1
            right = height(root.right) + 1

            if 1 < abs(right - left):
                result[0] = False
            return max(left, right)

        if not root:
            return True

        result = [True]

        left = height(root.left)
        right = height(root.right)

        if 1 < abs(right - left):
            return False

        return result[0]