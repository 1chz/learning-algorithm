'''
Implement Trie (Prefix Tree)

https://leetcode.com/problems/implement-trie/
06/01/2021
'''
class Trie:
    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.head = {}
        
    def insert(self, word: str) -> None: #Trie에 단어 입력
        """
        Inserts a word into the trie.
        """
        cur = self.head
        for ch in word:
            if ch not in cur:
                cur[ch] = {}
            cur = cur[ch]
        cur['*'] = True
        
    def search(self, word: str) -> bool: #Trie에서 단어 검색
        """
        Returns if the word is in the trie.
        """
        cur = self.head
        for ch in word:
            if ch not in cur:
                return False
            cur = cur[ch]
        if '*' in cur:
            return True
        return False
        
    def startsWith(self, prefix: str) -> bool: #Trie에서 매개변수로 주어진 단어로 시작하는 단어가 있는지 탐색
        """
        Returns if there is any word in the trie that starts with the given prefix.
        """
        cur = self.head
        for ch in prefix:
            if ch not in cur:
                return False
            cur = cur[ch]
        return True
        
# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)