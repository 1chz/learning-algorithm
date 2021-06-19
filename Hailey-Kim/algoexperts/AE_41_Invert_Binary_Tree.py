"""
Invert Binary Tree
06/18/2021
"""
# SOLUTION 1 - USING QUEUE
# O(N) time, O(N) space because at max you'll have O(N/2)leaf nodes in the queue

def invertBinaryTree(tree):
    queue = [tree]
    while len(queue):
        currentNode = queue.pop(0)
        if currentNode is None:
            continue
        swapLeftAndRight(current)
        queue.append(currentNode.left)
        queue.append(currentNode.right)

def swapLeftAndRight(tree):
    tree.left, tree.right = tree.right, tree.left

# SOLUTION 2 - SIMPLER WITHOUT USING QUEUE
# O(N) time, O(d) space
def invertBinaryTree(tree):
    if tree is None:
        return 
    swapLeftAndRight(tree)
    invertBinaryTree(tree.left)
    invertBinaryTree(tree.right)
    

def swapLeftAndRight(tree):
    tree.left, tree.right = tree.right, tree.left