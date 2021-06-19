"""
Generate Documents

06/17/2021
"""

# SOLUTION 1 - USING COUNTERS
from collections import Counter

def generateDocument(characters, document):
    available = Counter(characters)
	toMake = Counter(document)
	
	diff = toMake - available
	
	return not sum(diff.values()) > 0

	# O(m +  n) T ~> Counter is a subclass of a dictionary
	# O(c) S where c is # of unique ch

# SOLUTION 2 - USING DICTIONARY
def generateDocument(characters, document):
    counts = {}
	for i in characters:
		counts[i] = counts.get(i, 0) + 1

    for j in document:
		if j not in counts or counts[j] == 0:
			return False
        counts[j] -= 1

    return True

    # O(m+n) T, O(c) S