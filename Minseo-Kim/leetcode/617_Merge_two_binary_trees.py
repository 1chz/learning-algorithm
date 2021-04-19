# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# O(n), O(n) solution
# Runtime: 96 ms, faster than 26.55% of Python3
# Memory Usage: 15.8 MB, less than 6.75% of Python3
class Solution:
    def mergeTrees(self, root1: TreeNode, root2: TreeNode) -> TreeNode:
        if not root1 and not root2:
            return None
        merge_node = TreeNode()

        def rec(root1: TreeNode, root2: TreeNode, merge_node: TreeNode) -> None:
            if not root1 and not root2:
                return
            sum_value = 0
            l1_left_node, l1_right_node, l2_left_node, l2_right_node = None, None, None, None
            if root1:
                sum_value += root1.val
                l1_left_node = root1.left
                l1_right_node = root1.right
            if root2:
                sum_value += root2.val
                l2_left_node = root2.left
                l2_right_node = root2.right

            merge_node.val = sum_value

            if l1_left_node or l2_left_node:
                merge_node.left = TreeNode()
                rec(l1_left_node, l2_left_node, merge_node.left)
            if l1_right_node or l2_right_node:
                merge_node.right = TreeNode()
                rec(l1_right_node, l2_right_node, merge_node.right)

        rec(root1, root2, merge_node)
        return merge_node

# Simpler Solution

# Runtime: 88 ms, faster than 56.28% of Python3
# Memory Usage: 15.4 MB, less than 57.85% of Python3
class Solution:
    def mergeTrees(self, t1: TreeNode, t2: TreeNode) -> TreeNode:
        if not t1:
            return t2
        elif not t2:
            return t1
        else:
            merge_node = TreeNode()
            merge_node.val = t1.val + t2.val
            merge_node.left = self.mergeTrees(t1.left, t2.left)
            merge_node.right = self.mergeTrees(t1.right, t2.right)
            return merge_node