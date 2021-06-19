"""
Run-Length Encodings

06/17/2021
"""

# SOLUTION 1 - USE ARRAY FOR MUTABILITY AND BETTER TIME COMPLEXITY
def runLengthEncoding(string):
    arr = []
	count = 1
	
	for i in range(1, len(string)):
		prev = string[i - 1]
		curr = string[i]
		if prev != curr or count == 9:
			arr.append(str(count))
			arr.append(prev)
			count = 0
			
		count += 1
		
	arr.append(str(count))
	arr.append(string[-1])
	
	return ''.join(arr)
	
    # O(n) TS

# SOLUTION 2 - WITH STRING BUT IT CAN RESULT IN O(N^2) T
def runLengthEncoding(string):
    prev = ''
	count = 0
	answer = ''
	for ch in string:
		if prev == ch:
			count += 1
			if count == 9:
				answer += str(count) + prev
				count = 0
		else:
			answer += str(count) + prev if count > 0 else ''
			prev = ch
			count = 1
	
	answer += str(count) + prev if count > 0 else ''
			
	return answer

    # O(n^2) T because string concatenation each takes O(n) and it may occur n times!
    # O(n) S
    