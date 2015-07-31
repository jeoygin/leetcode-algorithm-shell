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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> valList = new ArrayList<Integer>();
        
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        if (root != null) {
            stack.push(root);
        }
        
        List<Integer> postorder = new ArrayList<Integer>();
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            postorder.add(cur.val);
            
            if (cur.left != null) {
                stack.push(cur.left);
            }
            
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        
        for (int i = postorder.size() - 1; i >= 0; i--) {
            valList.add(postorder.get(i));
        }
        
        return valList;
    }
}
