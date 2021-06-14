""" Tournament Winner

06/10/2021
https://www.algoexpert.io/questions/Tournament%20Winner
"""

# Solution 1
def tournamentWinner(competitions, results):
    result = {}

    for i, x in enumerate(results):
        if x == 1:
            winner = competitions[i][0]
        else:
            winner = competitions[i][1]
        result[winner] = result.get(winner, 0) + 3

    resultArr = [[x, result[x]] for x in result.keys()]
    resultArr.sort(key = lambda x: x[1])

    return resultArr[-1][0]

# time complexity - O(n*logn), space complexity - O(n)

# Solution 2
def tournamentWinner(competitions, results):
    result = {}
	answerP = -1

    for i, x in enumerate(results):
        if x == 1:
            winner = competitions[i][0]
        else:
            winner = competitions[i][1]
        result[winner] = result.get(winner, 0) + 3
	
	for name in result:
		if result[name] > answerP:
			answerP = result[name]
			answer = name
	
	return answer

# time complexity - O(n), space complexity - O(n)

# Solution 3
def tournamentWinner(competitions, results):
    answer = ""
	result = {answer: 0}

    for i, x in enumerate(results):
        if x == 1:
            winner = competitions[i][0]
        else:
            winner = competitions[i][1]
        result[winner] = result.get(winner, 0) + 3
		if result[winner] > result[answer]:
			answer = winner
	
	return answer

# time complexity - O(n), space complexity - O(30k+1) = O(k)