/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        TreeLinkNode head = root;
        
        while (head != null) {
            TreeLinkNode pParent = head;
            TreeLinkNode pChild = null;
            head = null;
            while (pParent != null) {
            	TreeLinkNode[] nodes= new TreeLinkNode[]{pParent.left, pParent.right};
            	for (TreeLinkNode node: nodes) {
            		if (node != null) {
            			if (pChild != null) {
            				pChild.next = node;
            			} else {
            				head = node;
            			}
            			pChild = node;
            		}
            	}
                pParent = pParent.next;
            }
        }
    }
}
