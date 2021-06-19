"""
First Non-Repeating Character

06/17/2021
"""

def firstNonRepeatingCharacter(string):
    chFrequencies = {}
	for ch in string:
		chFrequencies[ch] = chFrequencies.get(ch, 0) + 1
	for i, ch in enumerate(string):
		if chFrequencies[ch] == 1:
            return  i
    
    return -1

    # O(n) T
    # O(1) S because the max # of keys is  limited to 26