"""
River Sizes
06/20/2021
"""
# TIME - O(W x H), Visiting Every SIngle Node, Peeking at At Most 4 Nodes (x4)
# SPACE - O(W x H), Building an auxiliary array to keep track of visited/not

def riverSizes(matrix):
    # Either BFS or DFS!
	sizes = []
	visited = [[False for _ in row] for row in matrix]
	for i in range(len(matrix)):
		for j in range(len(matrix[0])):
			if visited[i][j]:
				continue
			traverseNode(i, j, matrix, visited, sizes)
	return sizes



def traverseNode(i, j, matrix,visited, sizes):
	currentRiverSize = 0
	nodesToExplore = [[i, j]] # stack
	while nodesToExplore:
		currentNode = nodesToExplore.pop()
		i, j = currentNode
		if visited[i][j]:
			continue
		visited[i][j] = True
		if matrix[i][j] == 0:
			continue
		currentRiverSize +=1
		unvisitedNeighbors = getUnvisitedNeighbors(i, j, matrix, visited)
		for neighbor in unvisitedNeighbors:
			nodesToExplore.append(neighbor)
			
	if currentRiverSize > 0:
		sizes.append(currentRiverSize)
		
		

def getUnvisitedNeighbors(i, j, matrix, visited):
	unvisitedNeighbors = []
	if i > 0 and not visited[i-1][j]:
		unvisitedNeighbors.append([i - 1, j])
	if i < len(matrix) - 1 and not visited[i+1][j]:
		
		unvisitedNeighbors.append([i+1, j])
	if j > 0 and not visited[i][j-1]:
		unvisitedNeighbors.append([i, j - 1])
	if j < len(matrix[0]) - 1 and not visited[i][j+1]:
		unvisitedNeighbors.append([i, j + 1])
		
	return unvisitedNeighbors
	
