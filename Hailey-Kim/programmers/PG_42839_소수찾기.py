'''
Find Prime Numbers with the Given Number String
When given a string of numbers, find the number of prime numbers
among numbers you can make with all the digits in the number string
ex. '17' given ~> [1, 7, 17, 71] ~> number of prime numbers: 3

1/18/21

programmers.co.kr
'''

import math

def numbersToArray(numbers):
    result = []
    lenNums = len(numbers)
    for i in range(lenNums):
        result.append(int(i))

    return result

def isPrimeNum(checkNum):
    if (checkNum == 0):
        return False
    if (checkNum == 2):
        return True
    if (checkNum % 2 == 0 or checkNum == 1):
        return False

    sqrtNum = math.sqrt(checkNum)

    k = 3
    while (k <= sqrtNum):
        if (checkNum % k == 0):
            return False

        k += 2
    return True


def swap(data, i, j):
    if (i != j):
        tmp = data[i]
        data[i] = data[j]
        data[j] = tmp

def Permutation(resultArray, data, depth, n, r):
    if (depth == r):
        num = 0
        for i in range(r):
            num = num * 10 + data[i]

        if num not in resultArray:
            resultArray.append(num)

    i = depth
    while (i < n):
        swap(data, i, depth)
        Permutation(resultArray,  data, depth+1, n, r)
        swap(data, i, depth)
        i += 1

    return resultArray

def solution(numbers):
    possibleNums = []
    numbersArray = numbersToArray(numbers)
    lenNums = len(numbersArray)
    answer = []

    for i in range(lenNums):
        Permutation(possibleNums, numbersArray, 0, lenNums, i+1)

    indices = len(possibleNums)

    for i in range(indices):
        if(isPrimeNum(possibleNums[i])):
            answer.append(possibleNums[i])

    return answer
