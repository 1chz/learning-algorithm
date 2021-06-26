"""
Number of Ways to Traverse Graph
06/19/2021
"""
# SOLUTION 1 - DP
    # O(m + n) ST

def numberOfWaysToTraverseGraph(width, height):
    # two-dimensional array!
	
	ways = [[1 for x in range(1, width + 1)] for _ in range(height)]
	for i in range(1, height):
		ways[i][0] = 1
	
	for j in range(1, width):
		for i in range(1, height):
			ways[i][j] = ways[i-1][j] + ways[i][j-1]
	return ways[-1][-1]


# SOLUTION 2 - RECURSION
    # O(2^(m+n)) T, O(m + n) S

def numberOfWaysToTraverseGraph(width, height):
    # recursion - O(2^(m + n)) T, O(m + n) S
	if width == 1 or height == 1:
		return 1
	
	return numberOfWaysToTraverseGraph(width -1, height) + numberOfWaysToTraverseGraph(width, height-1)


# SOLUTION 3 - PERM FORMULA
    # O(m + n) T, O(1) S
def numberOfWaysToTraverseGraph(width, height):
	# m = width - 1, n = height - 1 // {R, R, R, D, D} for example
	# (m + n)! / (m! n!)
	
	if width == 1 or height == 1:
		return 1
	m = width - 1 # x distance to corner
	n = height - 1 # y distance to corner
	return factorial(m + n) / factorial(m) / factorial(n)
	
	
def factorial(n):
	answer = 1
	for i in range(2, n+1):
		answer *= i
		
	return answer
