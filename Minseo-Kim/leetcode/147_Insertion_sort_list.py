# 정렬을 해야할 대상과(head) 정렬이 되어있는 대상(cur) 으로 나눠서 진행한다.


# O(n^2) insertion sort
# cur: already sorted / head: to be sorted

# Runtime: 1964 ms, faster than 28.39% of Python3
# Memory Usage: 16.4 MB, less than 60.58% of Python
class Solution:
    def insertionSortList(self, head: ListNode) -> ListNode:
        cur = parent = ListNode()

        while head:
            while cur.next and cur.next.val < head.val:
                cur = cur.next

            # head, cur.next, head.next = head.next, head, cur.next
            cur.next, head.next, head = head, cur.next, head.next

            cur = parent

        return parent.next

