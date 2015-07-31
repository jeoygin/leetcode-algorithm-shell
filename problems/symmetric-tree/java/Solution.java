public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetric(root.left, root.right);
    }

    boolean isSymmetric(TreeNode rootLeft, TreeNode rootRight) {
        if (rootLeft == null && rootRight == null) {
            return true;
        }

        if (!(rootLeft != null && rootRight != null) ||
            rootLeft.val != rootRight.val) {
            return false;
        }

        return isSymmetric(rootLeft.left, rootRight.right)
            && isSymmetric(rootLeft.right, rootRight.left);
    }
}
