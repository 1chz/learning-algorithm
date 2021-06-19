"""

Bubble Sorts

06/14/2021
"""

def bubbleSort(array):
    isSorted = False
	counter = 0
	while not isSorted:
		isSorted = True
		for i in range(len(array) - 1 - counter):
			if array[i] > array[i + 1]:
				array[i], array[i + 1] = array[i + 1], array[i]
				isSorted = False
		counter+=1
		
	return array

# Best - O(N) time, O(1) space, where n is the length of the input array


# Avg and Worst - O(N^2) time, O(1) space, where n is the length of the input Array
