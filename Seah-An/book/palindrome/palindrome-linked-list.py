# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, value, next=None):
        self.value = value
        self.next = next


class Solution(object):
    def isPalindrome(self, head: ListNode) -> bool:
        list = []
        node = head

        while node is not None:
            list.append(node.value)
            node = node.next

        while len(list) > 1:
            if list.pop(0) != list.pop():
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
