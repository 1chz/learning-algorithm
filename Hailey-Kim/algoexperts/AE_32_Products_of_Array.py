"""
Products of Array
06/17/2021
"""
#SOLUTION 1 - LEFT RUNNING PRODUCTS AND RIGHT RUNNING PRODUCTS
    # O(3n) = O(n) T, O(3n) = O(n) S
def arrayOfProducts(array):
    left = [1 for _ in range(len(array))]
    right = [1 for _ in range(len(array))] 

    leftRunningProduct = 1
    for i in range(len(array)):
        left[i] = leftRunningProduct
        leftRunningProduct*=array[i]

    rightRunningProduct = 1
    for i in reversed(range(len(array))):
        right[i] = rightRunningProduct
        rightRunningProduct*= array[i]

    answer = [left[i] * right[i] for i in range(len(array))]

    return answer

#SOLUTION2 - SAME BUT USE ONLY ONE ADDIT. ARRAY
    # O(2n) = O(n) T, O(n) S
def arrayOfProducts(array):
    answer = [1 for _ in range(len(array))]

    leftRunningProduct = 1
    for i in range(len(array)):
        answer[i] = leftRunningProduct
        leftRunningProduct*=array[i]

    rightRunningProduct = 1
    for i in reversed(range(len(array))):
        answer[i] = rightRunningProduct
        rightRunningProduct*= array[i]

    return answer
