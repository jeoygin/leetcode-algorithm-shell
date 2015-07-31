public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }

    public static TreeNode create(int... vals) {
        if (vals.length == 0) {
            return null;
        }
        TreeNode[] nodes = new TreeNode[vals.length];
        nodes[0] = new TreeNode(vals[0]);
        for (int i = 1; i< vals.length; i++) {
            if (vals[i] != -1) {
                nodes[i] = new TreeNode(vals[i]);
                if (i % 2 == 1) {
                    nodes[(i+1) / 2 - 1].left = nodes[i];
                } else {
                    nodes[(i+1) / 2 - 1].right = nodes[i];
                }
            }
            
        }

        return nodes[0];
    }

    public boolean equals(Object that) {
        if (that instanceof TreeNode) {
            return equals(this, (TreeNode) that);
        }
        return false;
    }

    public boolean equals(TreeNode src, TreeNode dst) {
        if (src == null && dst == null) {
            return true;
        }
        if (src == null || dst == null || src.val != dst.val) {
            return false;
        }
        if (!equals(src.left, dst.left) || !equals(src.right, dst.right)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(val);
        sb.append(",");
        if (left != null) {
            sb.append(left.toString());
        } 
        sb.append(",");
        if (right != null) {
            sb.append(right.toString());
        } 
        sb.append("}");
        return sb.toString();
    }
}
