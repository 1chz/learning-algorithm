"""

Binary Search

06/11/2021
https://www.algoexpert.io/questions/Binary%20Search
"""

def binarySearch(array, target):
	start, end = 0, len(array) - 1
	while start <= end:
		mid = (start + end) // 2
		if array[mid] == target:
			return mid
		elif array[mid] >target:
			end = mid - 1
		else: start = mid + 1

	return -1

# O(logn) T,  O(1) S  