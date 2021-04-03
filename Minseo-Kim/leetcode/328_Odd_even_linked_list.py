# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# O(n) / O(1) solution
# Runtime: 44 ms, faster than 60.62% of Python3
# Memory Usage: 16.3 MB, less than 85.18% of Python3
class Solution:
    def oddEvenList(self, head: ListNode) -> ListNode:
        if not head:
            return head

        count = 1
        odd_first_node, even_first_node, odd_node, even_node = ListNode(), ListNode(), ListNode(), ListNode()

        odd_first_node = odd_node
        even_first_node = even_node

        while head:
            if count % 2 == 1:
                odd_node.next = head
                odd_node = odd_node.next
            else:
                even_node.next = head
                even_node = even_node.next

            head = head.next
            count += 1

        even_node.next = None
        odd_node.next = even_first_node.next

        return odd_first_node.next
