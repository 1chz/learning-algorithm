"""
Min Number of Coins For Change
06/19/2021
"""
# Time Complexity: O(n) 
# Space Complexity: O(nd) where d is the number of denoms

def minNumberOfCoinsForChange(n, denoms):
    coins = [float("inf") for _ in range(n+1)]
	coins[0] = 0
	for denom in denoms:
		for amount in range(n+1):
			if denom <= amount:
				coins[amount] = min(coins[amount], 1 + coins[amount - denom])
    return coins[n] if coins[n] != float("inf") else -1