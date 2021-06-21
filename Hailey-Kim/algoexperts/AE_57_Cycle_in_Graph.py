"""
Cycle in Graph
06/21/2021
"""
# SOLUTION 1 - LIKE COURSE-SCHEDULE!
# O(V + E) T, O(V) S

def cycleInGraph(edges):
	visited = [0 for _ in range(len(edges))]
	for i in range(len(edges)):
		if not dfs(visited, edges, i):
			return True
	return False

def dfs(visited, edges, i):
	# -1: being visited
	# 1:already visited
	if visited[i] == -1:
		return False # cycle is there
	if visited[i] == 1:
		return  True # cycle is not there
	visited[i] = -1
	for j in edges[i]:
		if not dfs(visited, edges, j):
			return False
	visited[i] = 1
	return True

# SOLUTION 2 - AE
# O(V + E) T, O(V) S
def cycleInGraph(edges):
	
	numOfNodes = len(edges)
	visited = [False for _ in range(numOfNodes)]
	currentlyInStack = [False for _ in range(numOfNodes)]
	for node in range(numOfNodes):
		if visited[node]: continue
		containsCycle = isNodeInCycle(node, edges, visited, currentlyInStack)
		if containsCycle: return True
	return False

def isNodeInCycle(node, edges, visited, currentlyInStack):
	visited[node] = True
	currentlyInStack[node] = True
	neighbors = edges[node]
	for neighbor in neighbors:
		if not visited[neighbor]:
			containsCycle = isNodeInCycle(neighbor, edges, visited, currentlyInStack)
			if containsCycle:
				return True
		elif currentlyInStack[neighbor]:
			return True		
	currentlyInStack[node] = False
	return False