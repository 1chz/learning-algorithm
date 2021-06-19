"""
Find Closest Value in BST

06/11/2021
https://www.algoexpert.io/questions/Find%20Closest%20Value%20In%20BST
"""

# SOLUTION 1 - Iteration
def findClosestValueInBst(tree, target):
    curr = tree
	closest = float("inf")
	
	while curr is not None: 
		if abs(target - closest) > abs(target - curr.value):
			closest = curr.value
		if target < curr.value:
			curr = curr.left
		elif target > curr.value:
			curr = curr.right
		else:
			break
	return closest
			
	# time complexity - O(logn) on avg, O(n) in worst case
	# space complexity - O(1)


# This is the class of the input tree. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None



# SOLUTION 2 - Recursion
def findClosestValueInBst(tree, target):
    return bstHelper(tree, target, float("inf"))

def bstHelper(tree, target, closest):
	if tree is None:
		return closest
	if abs(target - closest) > abs(target - tree.value):
		closest = tree.value
	if target < tree.value:
		return bstHelper(tree.left, target, closest)
	elif target > tree.value:
		return bstHelper(tree.right, target, closest)
	else:
		return closest
	
# time complexity - O(logn) on average, O(n) in worst case (where there's only one branch)
# space complexity - O(n) for a call stack


# This is the class of the input tree. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

