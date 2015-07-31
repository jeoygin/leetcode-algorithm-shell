import java.util.LinkedList;
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<Integer>();
        
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        if (root != null) {
            stack.push(root);
        }
        
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur.right != null) {
                stack.push(cur.right);
            }
            
            if (cur.left != null) {
                stack.push(new TreeNode(cur.val));
                stack.push(cur.left);
            } else {
                valList.add(cur.val);
            }
        }
        
        return valList;
    }
}
