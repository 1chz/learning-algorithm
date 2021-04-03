# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None


# O(n), O(n) solution
# Runtime: 112 ms, faster than 81.73% of Python3
# Memory Usage: 18.7 MB, less than 91.55% of Python3
class Codec:

    def serialize(self, root) -> list:
        """Encodes a tree to a single string.

        :type root: TreeNode
        :rtype: str
        """

        def rec(root: TreeNode) -> None:
            if not root:
                ans.append(None)
                return
            ans.append(root.val)
            rec(root.left)
            rec(root.right)

        ans = list()
        rec(root)
        return ans

    def deserialize(self, data) -> TreeNode:
        """Decodes your encoded data to tree.

        :type data: str
        :rtype: TreeNode
        """
        if not data or data[0] == None:
            return None

        reversed_data = data[::-1]

        def rec() -> TreeNode:
            popped_val = reversed_data.pop()

            if popped_val is None:
                return None
            else:
                root = TreeNode()
                root.val = popped_val
                root.left = rec()
                root.right = rec()
                return root

        return rec()

# Your Codec object will be instantiated and called as such:
# ser = Codec()
# deser = Codec()
# ans = deser.deserialize(ser.serialize(root))