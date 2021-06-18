"""
Find Successor
06/18/2021
"""
# SOLUTION 1
    # brute-force
    # O(n) ST

class BinaryTree:
    def __init__(self, value, left=None, right=None, parent=None):
        self.value = value
        self.left = left
        self.right = right
        self.parent = parent

def findSuccessor(tree, node):
	inOrderTraversal = getInOrderTraversal(tree)
	for i in range(len(inOrderTraversal)):
		if node == inOrderTraversal[i] and i < len(inOrderTraversal) - 1:
			return inOrderTraversal[i + 1]
	return None

def getInOrderTraversal(tree, array = []):
	if tree is not None:
		getInOrderTraversal(tree.left, array)
		array.append(tree)
		getInOrderTraversal(tree.right, array)

    return array


# SOLUTION 2
    # if there's a right subtree
	    # the furthest left node of the right subtree
    # else
        # the node is its parent's right node
            # look further up
        # the node is its parent's left node
            # its parent node is the successor
    # LEFT, VISIT, RIGHT
# O(h) T, O(1) S
class BinaryTree:
    def __init__(self, value, left=None, right=None, parent=None):
        self.value = value
        self.left = left
        self.right = right
        self.parent = parent

def findSuccessor(tree, node):
    # node has a right child
	if node.right is not None:
		return getLeftmostChild(node.right) 
	
	return getRightmostParent(node)

def getLeftmostChild(node):
	currentNode = node
	while currentNode.left is not None:
		currentNode = currentNode.left
	return currentNode

def getRightmostParent(node):
    currentNode = node
    while currentNode.parent is not None and currentNode.parent.right == currentNode:
        currentNode = currentNode.parent

    


    return curentNode.parent