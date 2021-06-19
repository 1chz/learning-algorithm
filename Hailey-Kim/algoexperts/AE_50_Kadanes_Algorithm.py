"""
Kadane's ALGORITHM
06/19/2021
"""
# O(n) T, O(1) S

def kadanesAlgorithm(array):
	# maxEndingHere = max(maxEndingHere + currentNum, currentNum)
	# maxSoFar = max(maxSoFar, maxEndingHere)
	maxEndingHere = maxSoFar = array[0]
	for i in range(1, len(array)):
		currentNum = array[i]
		maxEndingHere = max(maxEndingHere + currentNum, currentNum)
		maxSoFar = max(maxSoFar, maxEndingHere)
		
	return maxSoFar