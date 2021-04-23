# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# O(n) solution : In-order traversal
# Runtime: 20 ms, faster than 98.94% of Python3
# Memory Usage: 14.5 MB, less than 10.84% of Python3

class Solution:
    def minDiffInBST(self, root: TreeNode) -> int:
        bst_array = [None, float('inf')]

        def rec(root: TreeNode) -> None:
            if not root:
                return

            rec(root.left)

            if bst_array[0]:
                difference = root.val - bst_array[0]
                if difference < bst_array[1]:
                    bst_array[1] = difference

            bst_array[0] = root.val

            if 1 < bst_array[1]:
                rec(root.right)

        rec(root)
        return bst_array[1]
