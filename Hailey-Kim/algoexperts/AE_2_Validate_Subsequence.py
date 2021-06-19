def isValidSubsequence(array, sequence):
    i = 0 # pointer for the sequence
	
	for num in array:
		if i == len(sequence):
			break
		if sequence[i] == num:
			i += 1
			
    return i== len(sequence)

# time complexity- O(n), space complexity - O(1)

    # i, j = 0, 0
	# while i < len(array) and j < len(sequence):
	# 	if array[i] == sequence[j]:
	# 		j += 1
	# 	i += 1
	# return j == len(sequence)

# time complexity - O(n), space complexity - O(1)
