"""
Reconstruct BST
06/18/2021
"""
# SOLUTION 1 - RECURSION WITH LOOP
# O(n^2) time, with loop O(n) at n recursive calls
# O(n) space to construct a tree, while O(h) in terms of call stack

# SOLUTION 2 - RECURSION
# O(n) time using lowerbound and  upperbound
# O(n) space to construct a tree, while O(h) in terms of call stack

# SOLUTION1
class BST:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right

def reconstructBst(preOrderTraversalValues):
    
    if len(preOrderTraversalValues)==0:
        return None
    # root value is the first element
    currentValue = preOrderTraversalValues[0]

    # Get the index of the right subtree element
    # which is greater than root value

    rightSubtreeRootIdx = len(preOrderTraversalValues)
    for i in range(1, len(preOrderTraversalValues)):
        if preOrderTraversalValues[i]  >= currentValue:
            rightSubtreeRootIdx = i
            break

    leftSubtree = reconstructBst(preOrderTraversalValues[1:rightSubtreeRootIdx])
    rightSubtree =  reconstructBst(preOrderTraversalValues[rightSubtreeRootIdx:])

    return BST(currentValue, leftSubtree, rightSubtree)





# SOLUTION2
class BST:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


# keep track of rootIdx
class TreeInfo:
    def __init__(self, rootIdx):
        self.rootIdx = rootIdx

def reconstructBst(preOrderTraversalValues):
    treeInfo = TreeInfo(0)
    return reconstructBstFromRange(float("-inf"),float("inf"),preOrderTraversalValues,treeInfo)


def reconstructBstFromRange(lowerBound, upperBound,  preOrderTraversalValues, treeInfo): 
    if treeInfo.rootIdx == len(preOrderTraversalValues):
        return None

    rootValue = preOrderTraversalValues[treeInfo.rootIdx]
    if rootValue < lowerBound or rootValue >= upperBound:
        return None

    treeInfo.rootIdx += 1
    
    leftSubtree = reconstructBstFromRange(lowerBound, rootValue, preOrderTraversalValues, treeInfo)
    rightSubtree = reconstructBstFromRange(rootValue, upperBound, preOrderTraversalValues, treeInfo)

    return BST(rootValue, leftSubtree, rightSubtree)