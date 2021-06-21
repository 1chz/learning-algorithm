"""
Min Heap Construction
06/21/2021
"""
# Build Heap: O(n) T using sift up method, O(1) S
# (note: sift down ~ you need to swap at most d times - able to expect)

# Sift-down: O(log(n)) T, O(1) S

# Sift-up: O(log(n)) T, O(1) S

# Peek: O(1) ST

# Remove: O(log(n)) T, O(1) S

# Insert: O(log(n))T, O(1) S

# Do not edit the class below except for the buildHeap,
# siftDown, siftUp, peek, remove, and insert methods.
# Feel free to add new properties and methods to the class.
class MinHeap:
    def __init__(self, array):
        # Do not edit the line below.
        self.heap = self.buildHeap(array)

    def buildHeap(self, array):
		firstParentIdx =(len(array) - 1) // 2
		for currentIdx in  reversed(range(firstParentIdx+1)):
			self.siftDown(currentIdx, len(array) - 1, array)
		return array

    def siftDown(self, currentIdx, endIdx, heap):
		leftChildIdx = currentIdx * 2 + 1
		while leftChildIdx <= endIdx:
			#as long as there is a child noe
			rightChildIdx = currentIdx * 2 + 2 if currentIdx * 2 + 2 <=endIdx else -1
			if rightChildIdx != -1 and heap[rightChildIdx] < heap[leftChildIdx]:
				idxToSwap = rightChildIdx
			else:
				idxToSwap = leftChildIdx
			if heap[idxToSwap] < heap[currentIdx]:
				self.swap(currentIdx, idxToSwap, heap)
				currentIdx = idxToSwap
				leftChildIdx = currentIdx * 2 + 1
			else:
				break
    
	def siftUp(self,currentIdx, heap):
        parentIdx =  (currentIdx - 1) //2
		while currentIdx > 0 and heap[currentIdx] < heap[parentIdx]:
			self.swap(currentIdx, parentIdx, heap)
			currentIdx = parentIdx
			parentIdx = (currentIdx - 1)//2

    def peek(self):
        return self.heap[0]

    def remove(self):
		self.swap(0, len(self.heap) - 1,  self.heap)
		valueToRemove = self.heap.pop() # remove the root
		self.siftDown(0, len(self.heap) - 1, self.heap)
		return valueToRemove

    def insert(self, value):
        self.heap.append(value)
		self.siftUp(len(self.heap) - 1, self.heap)
		# sift up the last node that is just inserted to
	
	def swap(self, i, j, heap):
		heap[i], heap[j] = heap[j], heap[i]