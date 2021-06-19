"""
BST Construction
06/17/2021
"""
# SOLUTION 1 - ITERATION (O(1) Space Complexity b/c no call stacks)
# All Operations - O(log(n)) T Avg, O(n) T Worst, O(1) S

# Do not edit the class below except for
# the insert, contains, and remove methods.
# Feel free to add new properties and methods
# to the class.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        currentNode = self
        while True:
            if value < currentNode.value:
				if currentNode.left is None:
					currentNode.left = BST(value)
					break
				else:
					currentNode = currentNode.left
            else:
				if currentNode.right is None:
					currentNode.right = BST(value)
					break
				else:
					currentNode = currentNode.right
            return self

    def contains(self, value):
        currentNode = self
		while currentNode is not None:
			if value <currentNode.value:
				currentNode = currentNode.left 
			elif value == currentNode.value:
				return True
			else:
				currentNode = currentNode.right
        return False


    def remove(self, value, parentNode=None):
        currentNode = self
		while currentNode is not None:
			if value < currentNode.value:
				parentNode = currentNode
				currentNode = currentNode.left
			elif value > currentNode.value:
				parentNode = currentNode
				currentNode = currentNode.right
			else:
				# two children nodes 
				if currentNode.left is not None and currentNode.right is not None:
					currentNode.value = currentNode.right.getMinValue()
                    # now the currentNode.value = smallest value of right subtree!
					currentNode.right.remove(currentNode.value, currentNode)
				# if it has one or zero child node(s) and it's the root node

                elif parentNode is None:
					if currentNode.left is not None:
						currentNode.value = currentNode.left.value
						currentNode.right = currentNode.left.right
						currentNode.left = currentNode.left.left
					elif currentNode.right is not None:
						currentNode.value = currentNode.right.value
						currentNode.left = currentNode.right.left
						currentNode.right= currentNode.right.right
                    else:
                        pass
                # if it's the left child
				elif parentNode.left == currentNode:
					parentNode.left = currentNode.left if currentNode.left is not None else currentNode.right
				# if it's the right child
				elif parentNode.right == currentNode:
					parentNode.right = currentNode.left if currentNode.left is not None else currentNode.right
                break
        return self

    def getMinValue(self):
        currentNode = self
		while currentNode.left is not None:
			currentNode = currentNode.left
		return currentNode.value


# SOLUTION 2 - RECURSION 
# All Operations - O(log(n)) Avg, O(n) Worst Time Complexity
# O(log(n)) Avg,O(n) Worst Space Complexity
class BST:
     def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
		currentNode = self
		while True:
			if value < currentNode.value:
				if currentNode.left is None:
					currentNode.left = BST(value)
					break
                else:
                    currentNode = currentNode.left
            else:
                if currentNode.right is None:
					currentNode.right = BST(value)
					break
				else:
					currentNode = currentNode.right

        return self

    def contains(self, value):
        currentNode = self
		while currentNode is not None:
			if value <currentNode.value:
				currentNode = currentNode.left 
			elif value == currentNode.value:
				return True
			else:
				currentNode = currentNode.right
		return False

    def remove(self, value, parentNode=None):
        currentNode = self
		while currentNode is not None:
			if value < currentNode.value:
				parentNode = currentNode
				currentNode = currentNode.left
			elif value > currentNode.value:
				parentNode = currentNode
				currentNode = currentNode.right
			else:
				# two children nodes 
				if currentNode.left is not None and currentNode.right is not None:
					currentNode.value = currentNode.right.getMinValue()
					# now the currentNode.value = smallest value of right subtree!
					currentNode.right.remove(currentNode.value, currentNode)
				# if it has one or zero child node(s) and it's the root node
				elif parentNode is None:
					if currentNode.left is not None:
						currentNode.value = currentNode.left.value
						currentNode.right = currentNode.left.right
						currentNode.left = currentNode.left.left
					elif currentNode.right is not None:
						currentNode.value = currentNode.right.value
						currentNode.left = currentNode.right.left
						currentNode.right= currentNode.right.right
					else:
						pass
				# if it's the left child
				elif parentNode.left == currentNode:
					parentNode.left = currentNode.left if currentNode.left is not None else currentNode.right
				# if it's the right child
				elif parentNode.right == currentNode:
					parentNode.right = currentNode.left if currentNode.left is not None else currentNode.right
        		break
		return self
	
	
	def getMinValue(self):
		currentNode = self
		while currentNode.left is not None:
			currentNode = currentNode.left

        return currentNode.value