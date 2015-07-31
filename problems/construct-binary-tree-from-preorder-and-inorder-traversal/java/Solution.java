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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    TreeNode buildTree(int[] preorder, int pl, int ph, int[] inorder, int il, int ih) {
        if (il > ih) {
            return null;
        }
        int idx = il;
        for (; idx <= ih && inorder[idx] != preorder[pl]; idx++);
        TreeNode root = new TreeNode(inorder[idx]);
        root.left = buildTree(preorder, pl + 1, pl + idx - il, inorder, il, idx - 1);
        root.right = buildTree(preorder, pl + idx - il + 1, ph, inorder, idx + 1, ih);
        return root;
    }
}
