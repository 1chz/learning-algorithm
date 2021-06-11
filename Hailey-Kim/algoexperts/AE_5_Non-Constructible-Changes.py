"""
Non-Constructible Change
AlgoExpert #5

https://www.algoexpert.io/questions/Non-Constructible%20Change
"""

def nonConstructibleChange(coins):
    if len(coins) == 0: return 1
	
	coins.sort()
	# c is the current maximum we can create
	# if v > c + 1, c + 1 is the answer
	c = 0
	for coin in coins:
		if coin > c + 1:
			return (c + 1)
		else:
			c += coin
	return (c+1)

# time complexity - O(n*logn), space complexity - O(1)