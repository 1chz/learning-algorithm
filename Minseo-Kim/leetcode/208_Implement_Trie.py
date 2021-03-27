from collections import defaultdict


class TrieNode:
    def __init__(self):
        self.word = False
        self.children = defaultdict(TrieNode)


class Trie:
    def __init__(self):
        self.root = TrieNode()

    def insert(self, word: str) -> None:
        node = self.root
        for char in word:
            node = node.children[char]
        node.word = True

    def search(self, word: str) -> bool:
        node = self.root
        for char in word:
            if char not in node.children.keys():
                return False
            node = node.children[char]
        return node.word

    def start_with(self, word: str) -> bool:
        node = self.root
        for char in word:
            if char not in node.children.keys():
                return False
            node = node.children[char]
        return True


def main():
    trie = Trie()
    trie.insert("apple")
    trie.insert("airport")
    trie.insert("permutation")

    print(trie.search("appl"))
    print(trie.search("a"))
    print(trie.search("apple"))
    print(trie.search("permutation"))
    print(trie.start_with("air"))
    print(trie.start_with("airy"))
