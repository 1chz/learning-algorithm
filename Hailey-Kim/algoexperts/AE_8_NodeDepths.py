"""
Node  Depths in a Binary Tree
https://www.algoexpert.io/questions/Node%20Depths

06/11/2021
"""

# SOLUTION 1 - ITERATION

def nodeDepths(root):
    summ = 0 
	stack = [{"node": root, "depth": 0}]
	while len(stack) > 0:
		currNode = stack.pop()
		node, depth = currNode["node"], currNode["depth"]
		if node is None:
			continue
		summ += depth
		stack.append({"node": node.left, "depth": depth + 1})
		stack.append({"node": node.right, "depth": depth + 1})
		
	return summ
		
# O(n) time, O(h) space becasue the max. number of functions in the function call
# <=> h!!
		

# This is the class of the input binary tree.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


# SOLUTION 2 - RECURSION

def nodeDepths(root):

	if root is None:
		return 0
	
	return depth + nodeDepths(root.left, depth + 1)+ nodeDepths(root.right, depth + 1)

# This is the class of the input binary tree.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
		
# O(n) time, O(h) space