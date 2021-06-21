"""
Task Assignments
06/21/2021
"""
# O(n log(n)) T, O(n) S

def taskAssignment(k, tasks):
    indexAndValue = []
	for i, value in enumerate(tasks):
		indexAndValue.append([value, i])	
	indexAndValue.sort()
	
	answers = []
	for i in range(k):
		answers.append([indexAndValue[i][1], indexAndValue[2*k-1-i][1]])
	return answers