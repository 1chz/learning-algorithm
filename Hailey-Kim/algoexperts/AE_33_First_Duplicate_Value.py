"""
First Duplicate Value
06/17/2021
"""
# SOLUTION 1 - USING SET (OR DICTIONARY COULD WORK AS WELL)
    # O(n) time | O(n) space
def firstDuplicateValue(array):
    # for unique value use set
	appeared = set()
	for value in array:
		if value in appeared:
			return value
		else:
			appeared.add(value)
	return -1


# SOLUTION 2 - MANIPULATING THE GIVEN ARRAY!
    # O(n) time | O(1) space
def firstDuplicateValue(array):
    # because numbers are given as 1 - n
	# we can manipulate the given array for our use
    for x in array:
		if array[abs(x)-1]< 0:
			return abs(x)
		else:
			array[abs(x)-1] *= -1

    return -1