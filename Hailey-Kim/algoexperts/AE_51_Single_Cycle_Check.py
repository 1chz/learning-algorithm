"""
Single Cycle Check
06/19/2021
"""
# SOLUTION 1
# O(n) TS

def hasSingleCycle(array):
    visited = [-1 for _ in range(len(array))]
	i = 0
	while True:
		i += array[i]
		if i < 0:
			while i < 0:
				i += len(array)
		elif i >= len(array):
			while i >= len(array):
				i -= len(array)
		
		if visited[i] > 0:
			return False
		visited[i] += 1
		
		if i == 0:
			break
			
	if sum(visited) == 0:
		return True
	else:
		return False

# SOLUTION 2
# O(n) T, O(1) S
def hasSingleCycle(array):
	i = 0
	count = 0
	while True:
		i += array[i]
		if i < 0:
			while i < 0:
				i += len(array)
		elif i >= len(array):
			while i >= len(array):
				i -= len(array)
				
		count += 1
				
		if count < len(array) and i == 0:
			return False
		
		elif count == len(array) and i != 0:
			return False
		elif count == len(array) and i == 0:
			return True

# SOLUTION 3
# AE Solution - O(n) T - O(1) S
def hasSingleCycle(array):
    numElementVisited = 0
	currentIdx = 0
	while numElementVisited < len(array):
		if numElementVisited > 0 and currentIdx == 0:
			return False
		numElementVisited += 1
		currentIdx = getNextIdx(currentIdx, array)
	return currentIdx== 0

def getNextIdx(currentIdx, array):
	jump = array[currentIdx]
	nextIdx = (currentIdx + jump) % len(array)

	return nextIdx if nextIdx >= 0 else nextIdx + len(array)
	# while python always yield the same sign with sth after modulo