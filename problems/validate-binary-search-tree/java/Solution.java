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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, int low, int high) {
        return root == null || root.val >= low && root.val <= high 
            && (root.left == null || root.val != Integer.MIN_VALUE && isValidBST(root.left, low, root.val - 1))
            && (root.right == null || root.val != Integer.MAX_VALUE && isValidBST(root.right, root.val + 1, high));
    }
}
