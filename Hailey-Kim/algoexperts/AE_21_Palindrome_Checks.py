"""
Palindrome Checks

06/17/2021

"""

# SOLUTION 1 - REVERSED STRING
def isPalindrome(string):
    return string == string[::-1]

    # O(n) T, O(n) S

# SOLUTION 2 - POINTERS
def isPalindrome(string):
    idx = 0
	n =len(string)
    while idx <= n-1 - idx:
		if string[idx] != string[n-1-idx]:
			return False
        idx += 1
	return True

    # O(n) T, O(1) S


# SOLUTION 3 - RECURSION
def isPalindrome(string, i = 0):
    j = len(string)-1 - i
	return True if i>= j else string[i] == string[j] and isPalindrome(string,i+1)


    # O(n) T, O(n) S