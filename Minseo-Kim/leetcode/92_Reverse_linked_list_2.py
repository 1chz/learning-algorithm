3  # Definition for singly-linked list.


# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# [1(start), 3, 2(end), 4(cur), 5] --> [1, 4, 3, 2, 5]
# start = 1, end = 2
# temp (going through between start and end)
# start.next = cur, cur.next = start.next, end.next = cur.next

# O(n) / O(1) solution
# Runtime: 28 ms, faster than 85.56% of Python3
# Memory Usage: 14.4 MB, less than 46.97% of Python3

class Solution:
    def reverseBetween(self, head: ListNode, left: int, right: int) -> ListNode:
        dummy, dummy.next = ListNode(0), head

        cur, start = head, dummy
        for _ in range(left - 1):
            cur, start = cur.next, start.next
        end = cur

        for _ in range(right - left + 1):
            start.next, cur.next, end.next, cur = cur, start.next, cur.next, cur.next

        return dummy.next
