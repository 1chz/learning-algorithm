class Solution:
    # time: O(n*slogs) space: O(n)
    # Runtime: 88 ms, faster than 95.79% of Python3
    # Memory Usage: 17.3 MB, less than 76.45%
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # O(n*slogs)
        sorted_map, result_list = {}, list()
        for s in strs:
            sorted_s = "".join(sorted(s))
            if sorted_s in sorted_map.keys():
                sorted_list = sorted_map.get(sorted_s)
                sorted_list.append(s)
                sorted_map.update({sorted_s: sorted_list})
            else:
                sorted_map.update({sorted_s: [s]})

        for i in sorted_map.keys():
            result_list.append(sorted_map.get(i))

        return result_list