"""
Minimum Passes Of Matrix
06/21/2021
"""
# go through the matrix and get the all positive integer positions
# get their adjacent neighbors and see whether any of them are negative!
	# if negative, make them positive and store them in a queue
	# as these 'new' positive values will be able to convert the adjacent negatives

# SOLUTION 1
# O(W x H) TS
	
def minimumPassesOfMatrix(matrix):
    passes = convertNegative(matrix)
    return passes - 1 if not containsNegative(matrix) else -1

def convertNegative(matrix):
	nextPassQueue = getAllPositivePositions(matrix) # store positive
	
	passes = 0

	while nextPassQueue:
		currentPassQueue = nextPassQueue
		nextPassQueue = [] # swap
		
		while currentPassQueue:
			currentRow, currentCol = currentPassQueue.pop(0) 
			# O(n) but if we use an actual queue it'll be O(1)
			
			adjacentPositions = getAdjacentPositions(currentRow, currentCol, matrix)
			for position in adjacentPositions:
				row, col = position
				
				value = matrix[row][col]
				if value < 0:
					matrix[row][col] *= (-1)
					nextPassQueue.append([row, col]) 
		passes+= 1
		
	return passes

def getAllPositivePositions(matrix):
	positivePositions = []
	
	for i in range(len(matrix)):
		for j in range(len(matrix[0])):
			if matrix[i][j] > 0:
				positivePositions.append([i, j])
				
	return positivePositions

def getAdjacentPositions(row, col, matrix):
	adjacentPositions = []
	if row  > 0: adjacentPositions.append([row - 1, col])
	if row < len(matrix) - 1:
		adjacentPositions.append([row + 1, col])
	if col > 0: adjacentPositions.append([row, col - 1])
	if col < len(matrix[0]) - 1:
		adjacentPositions.append([row, col + 1])
		
	return adjacentPositions

def containsNegative(matrix):
	for i in range(len(matrix)):
		for j in range(len(matrix[0])):
			if matrix[i][j] < 0:
				return True
	return False
	

# SOLUTION 2
# uses a single queue! then store the current len(queue) in a variable
# to loop only that much!


def minimumPassesOfMatrix(matrix):
    passes = convertNegative(matrix)
    return passes - 1 if not containsNegative(matrix) else -1

def convertNegative(matrix):
	queue = getAllPositivePositions(matrix) # store positive
	
	passes = 0

	while queue:
		currentSize = len(queue)
		
		while currentSize > 0:
			currentRow, currentCol = queue.pop(0) 
			# O(n) but if we use an actual queue it'll be O(1)
			
			adjacentPositions = getAdjacentPositions(currentRow, currentCol, matrix)
			for position in adjacentPositions:
				row, col = position
				
				value = matrix[row][col]
				if value < 0:
					matrix[row][col] *= (-1)
					queue.append([row, col]) 
					
			currentSize -= 1
		passes+= 1
		 
	return passes

def getAllPositivePositions(matrix):
	positivePositions = []
	
	for i in range(len(matrix)):
		for j in range(len(matrix[0])):
			if matrix[i][j] > 0:
				positivePositions.append([i, j])
				
	return positivePositions
