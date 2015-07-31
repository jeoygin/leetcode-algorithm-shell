public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        return convert(num, 0, num.length - 1);
    }

    TreeNode convert(int[] num, int l, int r) {
        if (r < l) {
            return null;
        }
        
        if (l == r) {
            return new TreeNode(num[l]);
        }

        int mid = (l + r) >> 1;
        TreeNode node = new TreeNode(num[mid]);
        node.left = convert(num, l, mid - 1);
        node.right = convert(num, mid + 1, r);
        return node;
    }
}
