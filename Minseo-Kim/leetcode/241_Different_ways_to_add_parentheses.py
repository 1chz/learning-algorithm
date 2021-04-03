# Time Complexity: O(n*2^n)
# Divide and conquer approach

# Runtime: 36 ms, faster than 62.96% of Python3
# Memory Usage: 14.4 MB, less than 54.44% of Python3

class Solution:
    def diffWaysToCompute(self, expression: str) -> List[int]:
        if "-" not in expression[1:] and "+" not in expression and "*" not in expression:
            return [int(expression)]

        result = list()
        for i in range(1, len(expression)):
            if expression[i] in "-+*":
                # divide
                left = self.diffWaysToCompute(expression[:i])  # potential left value list
                right = self.diffWaysToCompute(expression[i + 1:])  # potential right value list
                operator = expression[i]
                # conquer
                for l in left:
                    for r in right:
                        # result.append(eval(l + operator + r))
                        if operator == "-":
                            result.append(l - r)
                        elif operator == "+":
                            result.append(l + r)
                        elif operator == "*":
                            result.append(l * r)

        return result