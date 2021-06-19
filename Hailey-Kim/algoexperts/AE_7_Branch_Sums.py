"""
Branch Sums

06/11/2021
https://www.algoexpert.io/questions/Branch%20Sums
"""

# This is the class of the input root. Do not edit it.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def branchSums(root):
	sums = []
	calcBranchSum(root, 0, sums)    
	return sums

def calcBranchSum(node, runningSum, sums):
	if node is None:
		return
	newRunningSum = runningSum + node.value
	if node.left is None and node.right is None:
		sums.append(newRunningSum)
		return
	
	calcBranchSum(node.left, newRunningSum, sums)
	calcBranchSum(node.right, newRunningSum, sums)
	

# time complexity - O(n) time, space complexity - O(n/2) ~ O(number of leaft nodes) ~ O(n)
