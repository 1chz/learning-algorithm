'''
The Biggest Number
Given the array of numbers,
find the biggest number you can make by concatenating those numbers
01/2021
'''

def solution(numbers):
    answer = ''
    arr = [str(x) for x in numbers]
    arr.sort(key=lambda x: (x * 4)[:4], reverse=True)

    if arr[0] == '0':
        answer = '0'
    else:
        answer = ''.join(arr)
    return answer