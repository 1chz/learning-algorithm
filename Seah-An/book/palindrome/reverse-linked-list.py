# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next



class Solution(object):
    def reverseList(self, head: ListNode) -> ListNode:
        node = head
        prev = None

        while node != None:
            temp = node.next
            node.next = prev
            prev = node
            node = temp
        return prev


