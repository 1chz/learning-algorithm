"""
Class Photos

https://www.algoexpert.io/questions/Class%20Photos
06/11/2021
"""
def classPhotos(redShirtHeights, blueShirtHeights):
	redShirtHeights.sort() # O(nlogn)
	blueShirtHeights.sort() # O(nlogn)
	n = len(redShirtHeights)

	i = 0
	count = 0
	while i < n: # O(n)
		if redShirtHeights[i] > blueShirtHeights[i]:
			count += 1
		elif redShirtHeights[i]==blueShirtHeights[i]:
			return False
		i += 1

	if count == 0 or count == n:
		return True
	return False

# time complexity - O(nlogn)
# space complexity - O(1)