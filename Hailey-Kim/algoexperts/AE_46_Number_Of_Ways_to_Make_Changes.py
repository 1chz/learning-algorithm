"""
Number of Ways to Make Changes
06/19/2021
"""
# O(n) S, O(nd) T where d is the number of denominators

def numberOfWaysToMakeChange(n, denoms):
    # dp 'ways' = [0 for _ in range(n+1)]
	# array of 1 - n
	# each element representing # of ways to make k
	# if denom <= amount:
	#	ways[amount] += ways[amount - denom]
	
	ways = [0 for _ in range(n+1)]
	ways[0] = 1
	for denom in denoms:
		for amount in range(1, n+1):
			if denom <= amount:
				ways[amount] += ways[amount - denom]

    return ways[n]