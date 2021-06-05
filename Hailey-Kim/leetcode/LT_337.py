'''
House Robber III

https://leetcode.com/problems/house-robber-iii/
05/07/21
'''

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rob(self, root: TreeNode) -> int:
        rob_saved = {} # case when  the parent node of a certain node is robbed
        not_rob_saved = {} #case when the parent node of a certain node is not robbed
        
        def recursion(node, parent_robbed):
            # returning [when this node is robbed, when this node is not robbed]
            if not node:
                #return [0, 0] 
                return 0
            
            # 부모 노드가 털렸을 때는 현재 노드 못 텀
            if parent_robbed:
                if node in rob_saved:
                    return rob_saved[node]
                result = recursion(node.left, False) + recursion(node.right, False)
                
                rob_saved[node] = result
                return result

            # 부모 노드가 털리지 않았을 때는 현재 노드 털어도 되고 안 털어도 됨
            else:
                if node in not_rob_saved:
                    return not_rob_saved[node]
                # 현재 노드 터는 경우
                rob = node.val + recursion(node.left, True) + recursion(node.right, True)

                # 현재 노드 털지 않는 경우
                not_rob = recursion(node.left, False) +   recursion(node.right, False)

                # 둘 중 더큰 값 저장!
                result = max(rob, not_rob)
                not_rob_saved[node] = result
                return result

        return recursion(root, False) # 루트 위의 노드는 털리지 않음
        