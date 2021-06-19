"""
Levenshtein Distance
06/19/2021
"""
# SOLUTION1 - O(n x m) T, S
	# but actually, our solution uses ONLY TWO ROWS at a time
	# so we can use an array of 2 x min(m, n), as row/col can be either str1/str2
# SOLUTION2 - which means that space complexity could be O(min(n,m))
	
    # two-dimensional arrays
	# column - str2, row - str1
	#    " "  y  a  b  d
	# " " 0   1  2  3  4  ("" -> "": 0, "" -> "yab": 3, etc.)
	# a   1   1  1  2  3 
	# b   2   2  2  1  2  ("ab" -> "": 2)
	# c   3   3  3  2  2  (then "2" is the answer)
	# value - store  # of operations needed to make row to column
	
	# so the formula -> look at UP, DIAG-LEFT-UP, LEFT to find the min then plus 1
	# if row == col, move to  DIAG-LEFT-UP!
	
	# if str1[row] == str2[col]: E[row][col] = E[row-1][col-1]
	# else: E[row][col] = min(E[row-1][col], E[row][col-1], E[row-1][col-1]) +1

# SOLUTION 1
# O(m x n) ST
def levenshteinDistance(str1, str2):
    edits = [[x for x in range(len(str1)+1)] for _ in range(len(str2) + 1)]
	for i in range(len(str2) + 1):
		edits[i][0] = i
		
	for i in range(1,len(str2) + 1):
		for j in range(1, len(str1) + 1):
			if str2[i-1] == str1[j-1]:
				edits[i][j] = edits[i-1][j-1]
			else:
				edits[i][j] = min(edits[i-1][j], edits[i][j-1], edits[i-1][j-1]) + 1
				
	return edits[-1][-1]

# SOLUTION 2
# O(m x n) T, O(min(m, n)) S

def levenshteinDistance(str1, str2):
    small = str1 if len(str1) < len(str2) else str2
	big = str2 if len(str2)> len(str1) else str1
	
	evenEdits = [x for x in range(len(small)+1)]
	oddEdits = [None for _ in range(len(small)+1)]
		
	for i in range(1,len(big) + 1):
		if i % 2 == 1:
			currentEdits = oddEdits
			previousEdits = evenEdits
		else:
			currentEdits = evenEdits
			previousEdits = oddEdits
        currentEdits[0] = i
		for j in range(1, len(small) + 1):
			if big[i-1] ==small[j-1]:
				currentEdits[j] = previousEdits[j-1]
			else:
				currentEdits[j] = min(currentEdits[j-1], previousEdits[j-1], previousEdits[j]) + 1
    return evenEdits[-1] if len(big) % 2 == 0  else oddEdits[-1]