"""
Longest Peak
06/17/2021
"""
def longestPeak(array):
    # O(n) time, O(1) space
    maxPeak = 0

    i = 1
	while i < len(array) - 1:
		if array[i - 1] < array[i] and array[i] > array[i+1]:
			peak = 1
			j = i
			while j >= 0 and array[j - 1] < array[j]:
				peak += 1
				j -= 1
			k = i
			while k < len(array) - 1 and array[k] > array[k + 1]:
				peak += 1
				k += 1
			maxPeak = max(peak, maxPeak)
			i = k
        else:
			i += 1
    return maxPeak