# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# 1st) swap node.val
# 2nd) update node.next

# Time: O(n), Space: O(1) solution
# Runtime: 20 ms, faster than 99.11% of Python3
# Memory Usage: 14.2 MB, less than 78.47% of Python3

class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        prev, root, first, second = ListNode(0), ListNode(0), head, head.next
        root.next = second

        while first and second:
            first.next, second.next = second.next, first
            prev.next, prev = second, first

            first = first.next
            if first:
                second = first.next

        return root.next