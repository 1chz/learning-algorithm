"""
Binary Tree Diameter
06/18/2021
"""
# O(n) T, O(h) S - average, O(n) S - worst-case
class BinaryTree:
    def __init__(self, value, left = None, right =None):
        self.value = value
        self.left = left
        self.right = right

class TreeInfo:
    def __init__(self, diameter, height):
        self.diameter = diameter
        self.height = height

def binaryTreeDiameter(tree):
    # for each node, get (diameter, height)
    # where diameter = max(left's diameter, right's diameter, left's height + right's height)
    return getTreeInfo(tree).diameter


def getTreeInfo(tree):
    if tree is None:
        return TreeInfo(0, 0)
    
    leftTreeInfo = getTreeInfo(tree.left)
    rightTreeInfo = getTreeInfo(tree.right)

    longestPathThroughRoot = leftTreeInfo.height + rightTreeInfo.height

    diameter = max(leftTreeInfo.diameter, rightTreeInfo.diameter, longestPathThroughRoot)

    height = 1 + max(leftTreeInfo.height, rightTreeInfo.height)

    return  TreeInfo(diameter, height)