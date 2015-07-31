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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        dfs(root, sum, new LinkedList<Integer>(), ret);
        return ret;
    }
    void dfs(TreeNode node, int left, LinkedList<Integer> aux, List<List<Integer>> ret) {
        if (node == null) {
            return;
        }
        aux.offer(node.val);
        if (node.left == null && node.right == null && left == node.val) {
            ret.add(new ArrayList<Integer>(aux));
        }
        dfs(node.left, left - node.val, aux, ret);
        dfs(node.right, left - node.val, aux, ret);
        aux.pollLast();
    }
}
