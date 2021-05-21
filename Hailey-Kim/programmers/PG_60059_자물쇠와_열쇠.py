'''
Key and Lock

programmers.co.kr/learn/courses/30/lessons/60059

Given the two-dimensional arrays key (n x n) and lock (m x m)
and if the key can be rotated,
return true if the key can open the lock.
0 and 1 in those arrays indicate dents

03/08/21
'''

# rotate a two-dimensional array by 90 degrees

def rotate_by_90deg(matrix):
    n = len(matrix)
    m = len(matrix[0])
    new_matrix = [[0]*n for _ in range(m)]

    for i in range(n):
    	for j in range(m):
        	new_matrix[j][n-1-i] = matrix[i][j]

    return new_matrix

# expand the lock by 3 in each direction
# check if the key can open the lock
# by checking the middle area of the new lock


def check(new_lock):
    n = len(new_lock) // 3
    
    for i in range(n, n * 2):
    	for j in range(n, n * 2):
            if new_lock[i][j] != 1:
                return False
    return True
    
# solution
def solution(key, lock):
    n = len(lock)
    m = len(key)
    # initialize a new lock, 3x3 of original lock
    # in each dir
    new_lock = [[0] * (n * 3) for _ in range(n*3)]
    
    # have the values of the original lock
    # at the middle of the new lock
    for i in range(n):
        for j in range(n):
            new_lock[n + i][n + j] = lock[i][j] 
            
    # check the key for the lock in 360deg
    for _ in range(4):
    	key = rotate_by_90deg(key)
        for x in range(n*2):
            for y in range(n*2):
            	# test the key
                for i in range(m):
                    for j in range(m):
                        new_lock[x + i][y + j] += key[i][j]
                # check if right
                if check(new_lock):
                	return True
                    
                # if not reset
                for i in range(m):
                    for j in range(m):
                        new_lock[x + i][y + j] -= key[i][j]
                
    return False
