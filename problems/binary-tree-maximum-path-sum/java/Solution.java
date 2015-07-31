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
	int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if (root == null) {
        	return 0;
        }
        dfs(root);
        return res;
    }

    public int dfs(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	int maxLeft = dfs(root.left), maxRight = dfs(root.right), max = Math.max(maxLeft, maxRight) + root.val;
    	if (maxLeft + maxRight + root.val > res) {
    		res = maxLeft + maxRight + root.val;
    	}
    	return Math.max(0, max);
    }
}
