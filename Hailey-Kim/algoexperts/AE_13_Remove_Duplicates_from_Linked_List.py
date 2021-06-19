"""
Remove Duplicates from a Linked List

06/11/2021
https://www.algoexpert.io/questions/Remove%20Duplicates%20From%20Linked%20List
"""

# This is an input class. Do not edit.
class LinkedList:
	def __init__(self, value):
		self.value = value
		self.next = None

def removeDuplicatesFromLinkedList(linkedList):
	currentNode = linkedList

	while currentNode != None:
		nextNode =currentNode.next
		while nextNode != None
			and currentNode.value == nextNode.value:
			nextNode = nextNode.next

		currentNode.next = nextNode
		currentNode = nextNode

	return linkedList