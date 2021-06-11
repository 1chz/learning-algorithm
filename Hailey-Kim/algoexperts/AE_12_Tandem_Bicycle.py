"""
Tandem Bicycle

https://www.algoexpert.io/questions/Tandem%20Bicycle
06/11/2021
"""


def tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest):
    redShirtSpeeds.sort()
	if fastest == False:
		blueShirtSpeeds.sort()
	else:
		blueShirtSpeeds.sort(reverse=True)
	
	n = len(redShirtSpeeds)
	answer = 0
	
	for i in range(n):
		answer += max(redShirtSpeeds[i], blueShirtSpeeds[i])

	return answer

# time complexity = O(n*logn)
# space complexity = O(1)
