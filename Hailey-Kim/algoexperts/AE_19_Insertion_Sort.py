"""
Insertion Sort

06/14/2021

"""
def insertionSort(array):
    for i in range(1, len(array)):
		j = i
		while j > 0 and array[j] < array [j - 1]:
			array[j], array[j-1] = array[j-1], array[j]
			j -= 1
	return array

	# O(n) T, O(1) S
    
			
			