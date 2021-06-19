"""
Spiral Traverse
06/17/2021
"""
def spiralTraverse(array):	
	startRow, endingRow =0,len(array) - 1
	startCol, endingCol = 0, len(array[0]) - 1
    answer = []
    while startRow <= endingRow and startCol <= endingCol:
        # right
		for col in range(startCol,endingCol + 1):
			answer.append(array[startRow][col])
		if startRow == endingRow:
			break
        # down
		for row in range(startRow + 1, endingRow + 1):
			answer.append(array[row][endingCol])
		if startCol == endingCol:
			break
        # left
		for col in reversed(range(startCol, endingCol)):
            answer.append(array[endingRow][col])
        # up
		for row in reversed(range(startRow + 1, endingRow)):
			answer.append(array[row][startCol])
		startRow += 1
		endingRow -= 1
		startCol += 1
		endingCol -= 1
    return answer
    # O(N) time | O(N) space