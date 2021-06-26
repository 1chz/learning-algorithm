"""
Youngest-Common Ancestor.
06/20/2021
"""
# TIme COmplexity - O(d) where d is the depth of the deepest node
# Space Complexity - O(1) because we will only use loops

# get depth of each node - by stepping upwards
# move the deeper node up to where the shallower node is (at the same depth)

# then find the youngest common ancestor!

# This is an input class. Do not edit.
class AncestralTree:
    def __init__(self, name):
        self.name = name
        self.ancestor = None


def getYoungestCommonAncestor(topAncestor, descendantOne, descendantTwo):
    depthOne = getDescendantDepth(descendantOne, topAncestor)
	depthTwo = getDescendantDepth(descendantTwo, topAncestor)
	
	if depthOne > depthTwo:
		return backtrackAncestralTree(descendantOne, descendantTwo, depthOne - depthTwo)
	else:
		return backtrackAncestralTree(descendantTwo, descendantOne, depthTwo - depthOne)
	
def getDescendantDepth(descendant, topAncestor):
	depth = 0
	while descendant != topAncestor:
		descendant = descendant.ancestor
		depth += 1
	return depth

def backtrackAncestralTree(lowerDescendant, higherDescendant, diff):
	while diff > 0:
		lowerDescendant = lowerDescendant.ancestor
		diff -= 1
	while lowerDescendant !=higherDescendant:
		lowerDescendant = lowerDescendant.ancestor
		higherDescendant = higherDescendant.ancestor
	return lowerDescendant