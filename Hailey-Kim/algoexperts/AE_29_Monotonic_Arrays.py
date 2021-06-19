"""
Monotonic Arrays
06/17/2021
"""
# BOTH ARE O(n) t AND O(1)  s
# SOLUTION 1 - SMART!! USING LOGICS!!!!!
def isMonotonic(array):
    isNonIncreasing = True
	isNonDecreasing = True
    for i in range(1,len(array)):
		if array[i - 1] > array[i]:
			isNonIncreasing = False
		elif array[i - 1] < array[i]: 
			isNonDecreasing = False
    return isNonIncreasing  or isNonDecreasing
# SOLUTION 2 - COMPARING EACH
def isMonotonic(array):
    isIncreasing = None
	for i in range(1, len(array)):
		if isIncreasing == None:
			if array[i - 1] > array[i]:
				isIncreasing = False
			elif array[i-1] < array[i]:
				isIncreasing = True
		if isIncreasing and array[i - 1] > array[i]:
			return False
        elif not isIncreasing and array[i - 1] < array[i]:
            return False
    return True