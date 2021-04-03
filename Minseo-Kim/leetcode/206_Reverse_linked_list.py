# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


# Time complexity: O(n), ** Space complexity: O(1)**

# Runtime: 32 ms, faster than 87.13% of Python3
# Memory Usage: 15.5 MB, less than 93.25% of Python3
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        node, prev = head, None

        while node:
            # node <- node.next
            # node.next <- prev
            # prev <- node(current)
            node.next, node, prev = prev, node.next, node

        return prev