"""
Height Balanced Binary Tree
06/17/2021
"""
# This is an input class. Do not edit.
# O(n) T, O(h) S

class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right
		
class TreeInfo:
	def __init__(self, height, ifBalanced):
		self.height = height
		self.ifBalanced = ifBalanced

def heightBalancedBinaryTree(tree):
    return getSubtreeInfo(tree).ifBalanced 

def getSubtreeInfo(tree):
	if tree is None:
		return TreeInfo(-1, True)

	leftTreeInfo = getSubtreeInfo(tree.left)
	rightTreeInfo =getSubtreeInfo(tree.right)
	
	height = max(leftTreeInfo.height, rightTreeInfo.height) + 1
	ifBalanced = leftTreeInfo.ifBalanced and rightTreeInfo.ifBalanced and abs(leftTreeInfo.height - rightTreeInfo.height) <=1
	return TreeInfo(height, ifBalanced)
 