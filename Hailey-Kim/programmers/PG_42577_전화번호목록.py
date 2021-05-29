'''
Phone Book
Given the list of phone numbers,
return false if any number starts with another number in the list
01/2021
'''

import collections

def solution(phone_book):
    phone_book.sort()

    lenArray = len(phone_book)
    for i in range(lenArray):
        test = phone_book[i]
        print(test)
        j = 1
        while j < lenArray - i:
            if phone_book[i+j].startswith(test):
                print(phone_book[i+j])
                return False
            j += 1

    return True