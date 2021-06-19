"""

Find Three Largest Numbers

06/14/2021

"""

# SOLUTION 1 - WITH HEAP
import heapq

def findThreeLargestNumbers(array):	
	heap = [array[0], array[1], array[2]]
	heapq.heapify(heap)
	
	for i in range(3,len(array )):
		smallest = heap[0]
		if array[i] > smallest:
			
			heapq.heappop(heap)
			heapq.heappush(heap, array[i])
	
	
	answer = []
	for _ in range(3):
		answer.append(heapq.heappop(heap))
	return answer
		
# heapify - O(N)
# heapq.heappop, heapq.heappush - O(logN)

# SOLUTION 2 - WITH ARRAY
def findThreeLargestNumbers(array):
    answer = [None, None, None]
	for num in array:
		searchAndUpdate(answer, num)
	return answer
		
def searchAndUpdate(array, num):
	if array[2] == None or array[2] < num:
		shiftArray(array, 2, num)
	elif array[1] == None or array[1] < num:
		shiftArray(array, 1, num)
	elif array[0] == None or array[0] < num:
		shiftArray(array, 0, num)
	else:
		return
	
def shiftArray(array, idx, num):
	for i in range(idx):
		array[i] = array[i+1]
	array[idx] = num

# O(N) T O(1) S
	
