# O(s)
# using Trie & DFS
# Runtime: 380 ms, faster than 30.28% of Python3
# Memory Usage: 30.3 MB, less than 13.93% of Python3

from collections import defaultdict


class Node:
    def __init__(self):
        self.children = defaultdict(Node)
        self.word = False


class WordDictionary:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.root = Node()

    def addWord(self, word: str) -> None:
        node = self.root
        for char in word:
            node = node.children[char]
        node.word = True

    def search(self, word: str) -> bool:
        def rec(word: str, node: Node) -> bool:
            if node is None:
                node = self.root
            for i, char in enumerate(word):
                if char != "." and char not in node.children:
                    return False
                if char == ".":
                    for next_char in node.children.keys():
                        if rec(word[i + 1:], node.children[next_char]):
                            return True
                    return False
                node = node.children[char]
            return node.word

        return rec(word, None)
