"""
Max Subset Sum No Adjacent
06/18/2021
"""
# SOLUTION 1 - USING DP ARRAY
    # O(n) ST
def maxSubsetSumNoAdjacent(array):
    if len(array) == 0:
		return 0
	elif len(array) <= 2:
		return max(array)
	
	dp = [array[0], array[1]] + [0 for _ in range(len(array) - 2)]
	for i in range(2, len(array)):
		dp[i] = max(dp[i-2], dp[i-3]) + array[i]
		
	# dp = array[:]
	# dp[1] = max(array[0], array[1])
	# for i in range(2, len(array)):
	#	dp[i] = max(dp[i-1], dp[i-2] + array[i])
	
	# return dp[-1]

    return max(dp[-1], dp[-2])

# SOLUTION 2 - USING VARIABLES
    # O(n) T, O(1) S

def maxSubsetSumNoAdjacent(array):
    if not len(array):
		return 0
	elif len(array) == 1:
		return array[0]
	
	second = array[0]
	# if the question was to ask which numbers you used..
	# second = [array[0], [indices of numbers you used]]
	first = max(array[0], array[1])
	for i in range(2, len(array)):
		current = max(first, second + array[i])
        second, first= first, current

    return first