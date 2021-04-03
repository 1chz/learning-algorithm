
# O(n) / O(n)
# left -> node -> right 의 중위 순회를 하면서 total 을 먼저 구하고, 그 다음 다시 돌면서 누적값을 구하도록 풀었는데,
# 애초에 right -> node -> left 로 돌면 한 번만 돌아도 된다.

# Runtime: 32 ms, faster than 63.06% of Python3
# Memory Usage: 14.3 MB, less than 65.20% of Python3

class Solution:

    def bstToGst(self, root: TreeNode) -> TreeNode:
        total_sum = [0, 0]

        def get_total(root: TreeNode) -> None:
            if not root:
                return

            get_total(root.left)
            total_sum[0] += root.val
            get_total(root.right)

        def create_node(root: TreeNode) -> TreeNode:
            if not root:
                return None

            left = create_node(root.left)
            node = TreeNode(total_sum[0] - total_sum[1])
            total_sum[1] += root.val
            right = create_node(root.right)

            node.left = left
            node.right = right

            return node

        get_total(root)
        node = create_node(root)

        return node


# In order traversal

class Solution:

    def bstToGst(self, root: TreeNode) -> TreeNode:
        total_sum = [0]

        def rec(root: TreeNode) -> TreeNode:
            if not root:
                return None

            rec(root.right)
            total_sum[0] += root.val
            root.val = total_sum[0]
            rec(root.left)

            return root

        return rec(root)
