"""
Selection Sorts

06/14/2021

"""
def selectionSort(array):
    counter = 0
	while counter < len(array) - 1:
		minNum = counter
		for i in range(counter+1, len(array)):
			if array[minNum] > array[i]:
				minNum = i
		array[counter], array[minNum] = array[minNum], array[counter]
		counter += 1
	
	return array

	#Best, Average, Worst - T - O(n^2), S - O(1)
