# O(n), O(n)
# Runtime: 884 ms, faster than 5.18% of Python3
# Memory Usage: 47.5 MB, less than 6.30% of Python3

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        linked_list = list()

        while head is not None:
            linked_list.append(head.val)
            head = head.next

        left, right = 0, len(linked_list) - 1
        while left < right:
            if linked_list[left] != linked_list[right]:
                return False
            left += 1
            right -= 1

        return True

# O(n) solution, space O(1) solution... Linked List solution by Runner !
# Runtime: 668 ms, faster than 5.18% of Python3
# Memory Usage: 31.5 MB, less than 9.48% of Python3
class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        fast, slow, reverse = head, head, None

        while fast and fast.next:
            fast = fast.next.next
            reverse, reverse.next, slow = slow, reverse, slow.next

        if fast:
            slow = slow.next

        while reverse:
            if slow.val != reverse.val:
                return False
            reverse = reverse.next
            slow = slow.next

        return True