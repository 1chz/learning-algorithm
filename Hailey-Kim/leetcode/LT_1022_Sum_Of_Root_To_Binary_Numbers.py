"""
Sum of ROot To Leaf Binary Numbers

06/11/2021
https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumRootToLeaf(self, root: TreeNode) -> int:
        store = []
        self.dfs(root, '', store)
        
        answer = 0
        for x in store:
            answer += int(x, 2)
            
        return answer
     
    def dfs(self, node, runningNum, store):
        if not node:
            return 
        runningNum += str(node.val)
        
        if not node.left and not node.right:
            store.append(runningNum)
            
        self.dfs(node.left, runningNum, store)
        self.dfs(node.right, runningNum, store)
        
    # def convertBinaryToDecimal(self, binary):
    #     decimal = 0
    #     n = len(binary)
    #     for i in range(n):
    #         decimal += int(binary[n - 1 -i]) * (2 ** i)
    #     return decimal        