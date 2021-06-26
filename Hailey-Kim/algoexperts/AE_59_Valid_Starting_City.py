"""
Valid Starting City
06/21/2021
"""
# SOLUTION 1 - BRUTE-FORCE
#   O(n^2) T | O(1) S

def validStartingCity(distances, fuel, mpg):
    for start in range(len(distances)):
		if checkEachCity(distances, fuel, mpg, start):
			return start
		
def checkEachCity(distances, fuel, mpg, start):
	available  = fuel[start] * mpg
	currCity = start
	count = 0
	while count < len(distances): 
		if available >= distances[currCity]:
			available -= distances[currCity]
			count += 1
			currCity += 1
			currCity %= len(distances)
			available += fuel[currCity] * mpg
		else:
			return False
	
    return True


# SOLUTION 2 - TRAVERSE ONCE !
#   O(n) T | O(1) S
def validStartingCity(distances, fuel, mpg):
    milesLeft = minGas = minCity = 0
    for i in range(len(distances)):
		milesLeft+= fuel[i] * mpg - distances[i]
        if milesLeft < minGas:
			minGas = milesLeft
			minCity = (i + 1) % len(distances)
    return minCity