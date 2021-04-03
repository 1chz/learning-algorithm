# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# time O(n), space o(n) solution
# Runtime: 68 ms, faster than 74.58% of Python3
# Memory Usage: 14.2 MB, less than 73.26% of Python3

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        sum_node = head = ListNode(0)
        quote = 0

        while l1 or l2 or quote:
            two_sum = 0
            if l1:
                two_sum += l1.val
                l1 = l1.next
            if l2:
                two_sum += l2.val
                l2 = l2.next

            two_sum += sum_node.val
            quote, remainder = two_sum // 10, two_sum % 10
            sum_node.val = remainder

            if l1 or l2 or quote:
                sum_node.next = ListNode(quote)
                sum_node = sum_node.next

        return head
