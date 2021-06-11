"""
Minimum Waiting Time

https://www.algoexpert.io/questions/Minimum%20Waiting%20Time
"""

# Both O(nlogn) T, O(1) S 

def minimumWaitingTime(queries):
    answer = 0
	prev = 0
	queries.sort()
	
	for i in range(len(queries)-1):
		prev = prev + queries[i]
		answer += prev
		
	return answer

def minimumWaitingTime(queries):
    queries.sort()
	n =  len(queries)
	answer = 0
	
	for i, q in enumerate(queries):
		answer += q * (n-1 -i)
	
	return answer