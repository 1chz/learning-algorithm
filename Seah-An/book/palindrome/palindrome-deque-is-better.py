# Definition for singly-linked list.
import collections
from typing import Deque


class ListNode(object):
    def __init__(self, value, next=None):
        self.value = value
        self.next = next


# deque는 리스트와 달리 양쪽 방향에서 추출이 가능하기때문에 시간복잡도 O(1)
class Solution(object):
    def isPalindrome(self, head: ListNode) -> bool:
        l: Deque = collections.deque()
        node = head

        while node is not None:
            l.append(node.value)
            node = node.next

        while len(l) > 1:
            if l.pop(0) != l.pop():
                return False

        return True


if __name__ == "__main__":
    rs = Solution()
    # 1->2->1
    ln = ListNode(1)
    ln2 = ListNode(2)
    ln3 = ListNode(1)
    ln.next = ln2
    ln2.next = ln3
    print(rs.isPalindrome(ln))
