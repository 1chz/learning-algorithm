# time complexity : O(n) 모든 노드를 1번씩 방문하기 때문에
# space complexity : O(n) 재귀 호출을 하므로 stack 크기만큼의 공간 비용 발생

class Solution:

    def maxDepth(self, root: TreeNode) -> int:
        def find_recursively(root: TreeNode) -> int:
            if not root:
                return 0
            left = find_recursively(root.left) + 1
            right = find_recursively(root.right) + 1

            return max(left, right)

        return find_recursively(root)
