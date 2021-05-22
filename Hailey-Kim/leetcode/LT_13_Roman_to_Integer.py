class Solution:
    def romanToInt(self, s: str) -> int:
        n = len(s)
        i = 0
        answer = 0
        dic = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000, 'IV': 4, 'IX': 9, 'XL': 40, 'XC': 90, 'CD': 400, 'CM': 900}
        while i < n:
            if s[i:i+2] in dic:
                answer += dic[s[i:i+2]]
                i += 2 
            else:
                answer += dic[s[i]]
                i += 1
        return answer        