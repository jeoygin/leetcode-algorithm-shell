/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	if (root.left == null && root.right == null) {
    		return 1;
    	} else {
			return Math.min(root.left != null ? minDepth(root.left) : Integer.MAX_VALUE, root.right != null ? minDepth(root.right) : Integer.MAX_VALUE) + 1;    		
    	}
    }
}
