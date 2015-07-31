public class Solution {
    public int maxDepth(TreeNode root) {
    	return root != null ? Math.max(maxDepth(root.left), maxDepth(root.right)) + 1 : 0;
    }
}
