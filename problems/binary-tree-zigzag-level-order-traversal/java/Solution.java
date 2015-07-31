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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root != null) {
            LinkedList<TreeNode>[] stacks = new LinkedList[]{new LinkedList<TreeNode>(), new LinkedList<TreeNode>()};
            int cur = 0, next = 0;
            stacks[0].push(root);
            while (!stacks[cur].isEmpty()) {
                next = 1 - cur;
                List<Integer> list = new ArrayList<Integer>();
                while (!stacks[cur].isEmpty()) {
                    TreeNode node = stacks[cur].pop();
                    if (node != null) {
                        list.add(node.val);
                        stacks[next].push(cur == 0 ? node.left : node.right);
                        stacks[next].push(cur == 0 ? node.right : node.left);
                    }
                }
                if (!list.isEmpty()) {
                    ret.add(list);
                }
                cur = next;
            }
        }
        return ret;
    }
}
