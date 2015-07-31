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
    public int sumNumbers(TreeNode root) {
        return search(root, 0);
    }

    private int search(TreeNode root, int partSum) {
    	if (root == null) {
    		return 0;
    	}
    	partSum = partSum * 10 + root.val;
    	if (root.left == null && root.right == null) {
    		return partSum;
    	}
    	return (root.left != null ? search(root.left, partSum) : 0) + (root.right != null ? search(root.right, partSum) : 0);
    }
}
