"""
Remove Islands
06/20/2021
"""
# SOLUTION 1 - BETTER SPACE COMPLEXITY
# CHANGE 1'S CONNECTED TO BORDERS TO 2
# O(W x H) TS but better average time complexity!!)

# instead of making an auxiliary array with T or F,
# let's change the value to 2 if islands are connected to border
def removeIslands(matrix):
	for row in range(len(matrix)):
		for col in range(len(matrix[0])):
			rowIsBorder = row == 0 or row == len(matrix) - 1
			colIsBorder = col == 0 or col == len(matrix[0]) - 1
			isBorder = rowIsBorder or colIsBorder
			if not isBorder:
				continue
			
			if matrix[row][col] != 1:
				continue
				
			changeOnesConnectedToBorderToTwo(matrix, row, col)
			
	for row in range(len(matrix)):
		for col in range(len(matrix[0]) ):
			if matrix[row][col] == 2:
				matrix[row][col] = 1
			elif matrix[row][col] == 1:
				matrix[row][col] = 0
			
	return matrix
				
def changeOnesConnectedToBorderToTwo(matrix, startRow, startCol ):
	stack = [(startRow, startCol)]
	while len(stack) > 0:
		currentPos = stack.pop()
		currentRow, currentCol = currentPos
		
		matrix[currentRow][currentCol] = 2
		
		neighbors = getNeighbors(matrix, currentRow, currentCol)
		for neighbor in neighbors:
			row, col = neighbor
			if matrix[row][col]!=1:
				continue
			stack.append(neighbor)
			
def getNeighbors(matrix, row, col):
	neighbors = []
	if row - 1 >= 0: # UP
		neighbors.append([row - 1, col] )
	if row + 1 < len(matrix): # DOWN
		neighbors.append([row + 1, col])
	if col - 1 >= 0: # LEFT
		neighbors.append([row, col - 1])
	if col + 1 < len(matrix[0]): # RIGHT
		neighbors.append([row, col + 1])

	return neighbors

# SOLUTION 2 - USE AN AUXILIARY 2D ARRAY!
# O(W x H) TS, space because at most w x h elements in stack!
def removeIslands(matrix):
    onesConnectedToBorder = [[False for _ in matrix[0]] for _ in matrix]
	# will change to True if connected to border
	# loop through all the positions in the matrix
	# if anything is 1 on the border, DFS
	for row in range(len(matrix)):
		for col in range(len(matrix[0])):
			rowIsBorder = row == 0 or row == len(matrix) - 1
			colIsBorder = col == 0 or col == len(matrix[0]) - 1
			isBorder = rowIsBorder or colIsBorder
			if not isBorder:
				continue			
			if matrix[row][col] != 1:
				continue
				
			findOnesConnectedToBorder(matrix, row, col, onesConnectedToBorder)
			
	for row in range(1, len(matrix)-1):
		for col in range(1, len(matrix[0])-1):
			if onesConnectedToBorder[row][col]: # True
				continue
			matrix[row][col] = 0
			
	return matrix
			
def findOnesConnectedToBorder(matrix, startRow, startCol, onesConnectedToBorder):
	stack = [(startRow, startCol)]
	while len(stack) > 0:
		currentPos = stack.pop()
		currentRow, currentCol = currentPos
		
		alreadyVisited =onesConnectedToBorder[currentRow][currentCol] # True / False
		
		if alreadyVisited:
			continue
		
		onesConnectedToBorder[currentRow][currentCol] = True
		
		neighbors = getNeighbors(matrix, currentRow, currentCol)
		for neighbor in neighbors:
			row, col = neighbor
			if matrix[row][col]!=1:
				continue
			stack.append(neighbor)
			
def getNeighbors(matrix, row, col):
	neighbors = []

	if row - 1 >= 0: # UP
		neighbors.append([row - 1, col] )
	if row + 1 < len(matrix): # DOWN
		neighbors.append([row + 1, col])
	if col - 1 >= 0: # LEFT
		neighbors.append([row, col - 1])
	if col + 1 < len(matrix[0]): # RIGHT
		neighbors.append([row, col + 1])

	return neighbors