"""
Three Num Sum

06/17/2021


"""
def threeNumberSum(array, targetSum):
    answer = []
	array.sort()
	for i, currNum in enumerate(array):
		j = i + 1
		k = len(array) - 1
		while j < k:
			if currNum + array[j] + array[k] == targetSum:
				answer.append([currNum, array[j], array[k]])
				j += 1
				k -= 1
			elif currNum + array[j] + array[k] < targetSum:
				j += 1
			else:
				k -= 1
	return answer

    # O(n^2) T, O(n) S