# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# time: O(n), space: O(n) / seta(logn)

class Solution:
    def longestUnivaluePath(self, root: TreeNode) -> int:
        if not root:
            return 0

        longest_path = [0]

        def rec(root: TreeNode, val: int) -> int:
            if not root:
                return -1

            if root.val == val:
                left = rec(root.left, val) + 1
                right = rec(root.right, val) + 1
                if longest_path[0] < left + right:
                    longest_path[0] = left + right

                return max(left, right)
            else:
                left = rec(root.left, root.val) + 1
                right = rec(root.right, root.val) + 1
                if longest_path[0] < left + right:
                    longest_path[0] = left + right

                return -1

        root_sum = rec(root, root.val)
        return max(longest_path[0], root_sum)