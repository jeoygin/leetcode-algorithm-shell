/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
    TreeNode buildTree(int[] inorder, int il, int ih, int[] postorder, int pl, int ph) {
        if (il > ih) {
            return null;
        }
        int idx = il;
        for (; idx <= ih && inorder[idx] != postorder[ph]; idx++);
        TreeNode root = new TreeNode(inorder[idx]);
        root.left = buildTree(inorder, il, idx - 1, postorder, pl, pl + idx - il - 1);
        root.right = buildTree(inorder, idx + 1, ih, postorder, pl + idx - il, ph - 1);
        return root;
    }
}
