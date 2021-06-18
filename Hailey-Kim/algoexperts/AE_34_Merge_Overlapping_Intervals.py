"""
Merge Overlapping Intervals
06/17/2021
"""
# O(nlog(n)) time | O(n) space
def mergeOverlappingIntervals(intervals):
	intervals.sort()

    answer = [intervals[0]]
	for i, j in intervals:
		if i <= answer[-1][1]:
			answer[-1][0] = min(answer[-1][0], i)
			answer[-1][1] = max(answer[-1][1], j)
		else:
			answer.append([i, j])
			
	return answer