"""
Product Sum

06/11/2021

"""

# Tip: You can use the type(element) function to check whether an item
# is a list or an integer.
def productSum(array, multiplier=1):
	answer = 0
	for a in array:
		if type(a) == list:
			answer +=productSum(a, multiplier+1)
		else:
			answer += a

	return answer *multiplier


# O(n) T, where n = # of elements in the array
# incl. subarrays EX. [1, 2, [3, 4, 5]] => n = 6

# O(d) S, where d = # of max depths of arrays
# because max d calls may stay on the stack
# simultaneously