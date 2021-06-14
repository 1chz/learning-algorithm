"""
Nth Fibonacci

06/11/2021
"""

# SOLUTION 1 - RECURSINO AND MEMOIZATION
def getNthFib(n, memoize = {1:0, 2: 1}):
	if n in memoize:
		return memoize[n]
	else:
		memoize[n] = getNthFib(n-1, memoize) + getNthFib(n-2, memoize)
		
		return memoize[n]
	
# time complexity - O(n)
# space complexity - O(1)

# SOLUTION 2 - ITERATION!
def getNthFib(n):
	if n <= 2:
		return n-1
	a, b = 0, 1
	
	for _ in range(2, n):
		a, b = b, a+b
		
	return b

#  O(n) T, O(1) S
	
