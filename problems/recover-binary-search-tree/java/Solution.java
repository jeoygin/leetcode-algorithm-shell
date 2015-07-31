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
    public void recoverTree(TreeNode root) {
        TreeNode first = null, second = null, prev = new TreeNode(Integer.MIN_VALUE), cur = root;
        while (cur != null) {
            TreeNode tmp = cur.left;
            if (tmp != null) {
                while (tmp.right != null && tmp.right != cur) {
                    tmp = tmp.right;
                }
            }
            if (tmp != null && tmp.right == null) {
                tmp.right = cur;
                cur = cur.left;
            } else {
                if (tmp != null) {
                    tmp.right = null;    
                }
                if (first == null && prev.val > cur.val) {
                    first = prev;
                }
                if (first != null && prev.val > cur.val) {
                    second = cur;
                }
                prev = cur;
                cur = cur.right;
            }
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
}
