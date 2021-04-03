# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# O(nlogn) / O(n) solution
# Divide and conquer algorithm
# improvement : Merge sort 를 iteration 으로 구현하면 Space O(1)으로 줄일수있음.
# 구현에서 버그가 많이 생김. 다시 연습해보기.

class Solution:
    def sortList(self, head):
        if head is None or head.next is None:
            return head

        half, slow, fast = None, head, head
        while fast and fast.next:
            half, slow, fast = slow, slow.next, fast.next.next
        half.next = None

        l1 = self.sortList(head)
        l2 = self.sortList(slow)

        return self.merge(l1, l2)

    def merge(self, l1, l2):
        if l1 and l2:
            if l2.val < l1.val:
                l1, l2 = l2, l1
            l1.next = self.merge(l1.next, l2)

        return l1 or l2

