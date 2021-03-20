class Solution:
    # time complexity: O(s^n) when s is the number of possible characters for each digit and n is length of digits
    # space complexity: O(n) as a layer is to be appended by every recursive call
    # Runtime: 28 ms, faster than 86.01% of Python3
    # Memory Usage: 14 MB, less than 96.93% of Python3

    def dictionary(self) -> dict:
        result = {}
        result.update({'2': ['a', 'b', 'c']})
        result.update({'3': ['d', 'e', 'f']})
        result.update({'4': ['g', 'h', 'i']})
        result.update({'5': ['j', 'k', 'l']})
        result.update({'6': ['m', 'n', 'o']})
        result.update({'7': ['p', 'q', 'r', 's']})
        result.update({'8': ['t', 'u', 'v']})
        result.update({'9': ['w', 'x', 'y', 'z']})
        return result

    def letterCombinations(self, digits: str) -> List[str]:
        char_dictionary, result = self.dictionary(), list()

        def append_recursively(current: str, digit_num: int) -> None:
            if digit_num == len(digits):
                if current != "":
                    result.append(current)
                return
            candidates = char_dictionary.get(digits[digit_num])
            for c in candidates:
                append_recursively(current + c, digit_num + 1)
            return

        append_recursively("", 0)

        return result
