# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

# 순회시 preorder/inorder/postorder 3가지중 2개만 있으면 트리를 복원할 수 있다.
# O(n) / O(n) solution

# Runtime: 132 ms, faster than 55.14% of Python3
# Memory Usage: 53.7 MB, less than 29.76% of Python3

class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> TreeNode:
        preorder = preorder[::-1]

        def visit(inorder: List[int]) -> TreeNode:
            if not inorder:
                return None

            root_val = preorder.pop()
            index = inorder.index(root_val)
            root = TreeNode(root_val)

            root.left = visit(inorder[:index])
            root.right = visit(inorder[index + 1:])

            return root

        return visit(inorder)