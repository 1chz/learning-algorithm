# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# diameter = sum(height of the left + height of the right at every node)

# time: O(n) space: O(n) at worst case and O(logn) if balanced tree
# Runtime: 36 ms, faster than 96.98% of Python3
# Memory Usage: 16.4 MB, less than 25.00% of Python3

class Solution:
    def diameterOfBinaryTree(self, root: TreeNode) -> int:
        def compute_height(root: TreeNode) -> int:
            if not root:
                return -1
            left = compute_height(root.left) + 1
            right = compute_height(root.right) + 1

            if result[0] < left + right:
                result[0] = left + right

            return max(left, right)

        result = [0]
        return max(compute_height(root), result[0])
