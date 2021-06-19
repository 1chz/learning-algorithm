"""
Find the Kth Largest Value In BST
06/18/2021
"""
# SOLUTION 1 - Use InOrder Traversal, then Read from Right
    # O(n) T, O(n) S

# SOLUTION 2 - Use Reverse-InOrder Traversal, while keeping track of NumOfNodesVisited and LatestVisitedNodeValue
    # O(h + k)T, O(h) S

# SOLUTION1

# This is an input class. Do not edit.
class BST:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def findKthLargestValueInBst(tree, k):
    # inorder traversal to get the order
	# then read from the right
	
	sortedArr = inOrderTraverse(tree, [])
	return sortedArr[-k]
	
def inOrderTraverse(tree, array):
	if tree is not None:
		inOrderTraverse(tree.left, array)
		array.append(tree.value)
		inOrderTraverse(tree.right, array)
	return array


# SOLUTION2

# This is an input class. Do not edit.
class BST:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

class TreeInfo:
	def __init__(self, numberOfNodesVisited, latestVisitedNodeValue):
		self.numberOfNodesVisited = numberOfNodesVisited
		self.latestVisitedNodeValue =  latestVisitedNodeValue
		
def findKthLargestValueInBst(tree, k):
    # Write your code here.
    # reverse of the inorder traverse
	
	# keep track of the nodes you're visiting with visited and lastValue variables
	treeInfo = TreeInfo(0, -1)
	reverseInOrderTraverse(tree, k, treeInfo)
	return treeInfo.latestVisitedNodeValue

def reverseInOrderTraverse(node, k, treeInfo):
	if node is None or treeInfo.numberOfNodesVisited == k:
		return
	reverseInOrderTraverse(node.right, k, treeInfo)
	if treeInfo.numberOfNodesVisited < k:
		treeInfo.numberOfNodesVisited += 1
		treeInfo.latestVisitedNodeValue = node.value
	
		reverseInOrderTraverse(node.left, k, treeInfo) #traverse further to the left only when visited < k!