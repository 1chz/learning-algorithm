"""
BST Traversals
06/17/2021
"""

# O(n) Time, O(n) Space - but if it was to just print out the nodes, it would be O(d) S, where d is the depth of the tree!

def inOrderTraverse(tree, array): 
    if tree is not None:
		inOrderTraverse(tree.left, array)
		array.append(tree.value)
		inOrderTraverse(tree.right, array)
	return array

def preOrderTraverse(tree, array):
    if tree is not None:
		array.append(tree.value)
		preOrderTraverse(tree.left, array)
		preOrderTraverse(tree.right, array)
    return array

def postOrderTraverse(tree, array):
    if tree is not None:
		postOrderTraverse(tree.left, array)
		postOrderTraverse(tree.right, array)
		array.append(tree.value)
    return array