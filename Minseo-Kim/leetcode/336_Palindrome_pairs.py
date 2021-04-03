# the 1st solution: O(k * n^2) by Brute force
# the 2nd solution: O(k^2 * n) by hash table or trie
# range of list : 100 ~ 1000
# range of word length : 1 ~ 10

class Solution:
    def palindromePairs(self, words: List[str]) -> List[List[int]]:
        dictionary, result_list = {}, []
        for i, v in enumerate(words):
            dictionary.update({v[::-1]: i})
        indices = set()
        for i, v in enumerate(words):
            for j in range(len(v) + 1):
                prefix, postfix = v[:j], v[j:]
                if prefix in dictionary and i != dictionary[prefix] and postfix[::-1] == postfix:
                    indices.add((i, dictionary[prefix]))
                if postfix in dictionary and i != dictionary[postfix] and prefix == prefix[::-1]:
                    indices.add((dictionary[postfix], i))
        return [list(i) for i in indices]