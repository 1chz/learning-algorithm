"""
Min-Height BST
06/18/2021
"""
# SOLUTION 1 - RECURSION : O(nlog(n)) T, O(n) S
# SOLUTION 2 - ITERATION : O(n) T using manual insertion, O(n) S
# SOLUTION 3- THE SAME LOGIC AS SOLUTION 2, BUT CLEANER FORMAT!

# SOLUTION 1
# O(n log(n)) T b/c "insert" starts from the bst root node so it takes log(n)
# for n nodes

# O(n) space

def minHeightBst(array):
    return constructMinHeightBST(array, None, 0, len(array) - 1)
def constructMinHeightBST(array, bst, startIdx, endIdx):
	if startIdx > endIdx:
		return
	midIdx = (startIdx + endIdx) // 2
	if bst is None:
		bst = BST(array[midIdx])
	else:
		bst.insert(array[midIdx]) # HERE IT BECOMES O(nlog(n))
	constructMinHeightBST(array, bst, startIdx, midIdx - 1)
	constructMinHeightBST(array, bst,  midIdx + 1, endIdx)
	return bst
	
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = BST(value)
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = BST(value)
            else:
                self.right.insert(value)

# SOLUTION 2
def minHeightBst(array):
    return constructMinHeightBST(array, None, 0, len(array) - 1)
def constructMinHeightBST(array, bst, startIdx, endIdx):
	if startIdx > endIdx:
		return
	midIdx = (startIdx + endIdx) // 2
	newBSTNode = BST(array[midIdx])
	if bst is None:
		bst = newBSTNode
	else:
		if bst.value > array[midIdx]:
			bst.left = newBSTNode
			bst = bst.left
		else:
			bst.right = newBSTNode
			bst = bst.right #manual insertion - O(n) 
	constructMinHeightBST(array, bst, startIdx, midIdx - 1)
	constructMinHeightBST(array, bst,  midIdx + 1, endIdx)
	return bst


class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = BST(value)
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = BST(value)
            else:
                self.right.insert(value)


# SOLUTION 3
def minHeightBst(array):
    return constructMinHeightBST(array, 0, len(array) - 1)
def constructMinHeightBST(array, startIdx, endIdx):
	if startIdx > endIdx:
		return None
	midIdx = (startIdx + endIdx) // 2
	bst = BST(array[midIdx])
	
	bst.left = constructMinHeightBST(array, startIdx, midIdx - 1)
	bst.right = constructMinHeightBST(array,  midIdx + 1, endIdx)
	return bst

class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = BST(value)
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = BST(value)
            else:
                self.right.insert(value)