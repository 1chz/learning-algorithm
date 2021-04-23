# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# time: O(n), space: O(n)
class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        def reverse(root: TreeNode) -> TreeNode:
            if not root:
                return
            root.left, root.right = root.right, root.left

            reverse(root.left)
            reverse(root.right)

        reverse(root)
        return root
