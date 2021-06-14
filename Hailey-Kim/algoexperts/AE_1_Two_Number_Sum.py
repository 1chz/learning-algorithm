"""
Two Number Sum
AlgoExpert #1

https://www.algoexpert.io/questions/Two%20Number%20Sum
"""

# Solution 1
def twoNumberSum(array, targetSum):
    array.sort()
	i, j = 0, len(array) - 1
	
	
	while i < j:
		if array[i] + array[j] == targetSum:
			return [array[i], array[j]]
		elif array[i] + array[j] < targetSum:
			i += 1
		else:
			j -= 1
	return []

# time - O(n*log(n)), space - O(1)


# Solution 2
def twoNumberSum(array, targetSum):
    array.sort()
	i, j = 0, len(array) - 1
	
	
	while i < j:
		if array[i] + array[j] == targetSum:
			return [array[i], array[j]]
		elif array[i] + array[j] < targetSum:
			i += 1
		else:
			j -= 1
	return []

# time - O(n*log(n)), space - O(1)

# Solution 3
def twoNumberSum(array, targetSum):
    hashTable = {}
	for num in array:
		if num in hashTable:
			return [targetSum - num, num]
		else:
			hashTable[targetSum-num] = True
	return []

# time - O(n), space = O(n)