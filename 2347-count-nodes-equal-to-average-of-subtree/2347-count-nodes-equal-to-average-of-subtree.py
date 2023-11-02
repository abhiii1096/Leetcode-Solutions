from typing import Optional, Tuple

class TreeNode:
    def _init_(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution:
    def averageOfSubtree(self, root: Optional[TreeNode]) -> int:
        def dfs(node: TreeNode) -> Tuple[int, int]:
            nonlocal count
            
            # Base case: when the node is None, return sum=0 and count=0
            if not node:
                return (0, 0)
            
            # Recursive case: post-order traversal
            left_sum, left_count = dfs(node.left)
            right_sum, right_count = dfs(node.right)
            
            # Calculate the total sum and count for the current subtree
            total_sum = left_sum + right_sum + node.val
            total_count = left_count + right_count + 1
            
            # Check if the current node's value is equal to the average
            if node.val == total_sum // total_count:
                count += 1
                
            # Return the total sum and count for the current subtree
            return (total_sum, total_count)
        
        count = 0
        dfs(root)
        return count