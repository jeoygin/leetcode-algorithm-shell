public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        TreeLinkNode head = root;
        
        while (head.left != null) {
            TreeLinkNode pParent = head;
            TreeLinkNode pChild = head.left;
            head = head.left;
            while (pParent != null) {
                pChild.next = pParent.left;
                pChild.next.next = pParent.right;
                pChild = pParent.right;
                pParent = pParent.next;
            }
        }
    }
}
