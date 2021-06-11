"""
Depth-First Search

06/11/2021

"""
# Do not edit the class below except
# for the depthFirstSearch method.
# Feel free to add new properties
# and methods to the class.
class Node:
    def __init__(self, name):
        self.children = []
        self.name = name

    def addChild(self, name):
        self.children.append(Node(name))
        return self

    def depthFirstSearch(self, array): # O(V + E) T, O(V) S
		array.append(self.name)
		for child in self.children:
			child.depthFirstSearch(array)
		return array