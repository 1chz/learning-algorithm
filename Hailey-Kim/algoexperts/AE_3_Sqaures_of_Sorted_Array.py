"""
Squares of Sorted Array

https://leetcode.com/problems/squares-of-a-sorted-array/
AlgoExpert #3
06/11/2021

"""

def sortedSquaredArray(array):
    result = [x**2 for x in array]
	result.sort()
	
	return result

# time complexity - O(n*logn), space complexity - O(n)

def sortedSquaredArray(array):
	n = len(array)
    result = [0 for _ in array]
	
	i, j, k = 0, n - 1, n - 1
	
	while i <= j:
		if abs(array[i]) <= abs(array[j]):
			result[k] = array[j] ** 2
			j -= 1
			k -= 1
		else:
			result[k] = array[i] ** 2
			i += 1
			k -= 1
	
	return result

# time complexity - O(n), space complexity- O(n)