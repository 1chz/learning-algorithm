"""
Validate BST
06/17/2021
"""
# O(n) T to traverse all nodes, O(d) S for call stack

# Input Class
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def validateBst(tree):
    return validateBSTHelper(tree, float("-inf"), float("inf"))

def validateBSTHelper(tree, minValue, maxValue):
	if tree is None:
		return True
	if tree.value < minValue or tree.value >= maxValue:
		return False
	leftIsValid = validateBSTHelper(tree.left,minValue,tree.value)
	rightIsValid = validateBSTHelper(tree.right ,tree.value,maxValue)
	return leftIsValid and rightIsValid