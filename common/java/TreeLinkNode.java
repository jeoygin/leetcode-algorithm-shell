public class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }

    public static TreeLinkNode create(int... vals) {
    	if (vals.length == 0) {
    		return null;
    	}
    	TreeLinkNode[] nodes = new TreeLinkNode[vals.length];
    	nodes[0] = new TreeLinkNode(vals[0]);
    	for (int i = 1; i< vals.length; i++) {
    		if (vals[i] > 0) {
    			nodes[i] = new TreeLinkNode(vals[i]);	
                if (i % 2 == 1) {
                    nodes[(i+1) / 2 - 1].left = nodes[i];
                } else {
                    nodes[(i+1) / 2 - 1].right = nodes[i];
                }
    		}
    		
    	}

    	return nodes[0];
    }

    public static TreeLinkNode createWithNext(int... vals) {
    	if (vals.length == 0) {
    		return null;
    	}
    	if (vals.length % 2 == 1) {
    		throw new IllegalArgumentException("The number of arguments should be even");
    	}
    	TreeLinkNode[] nodes = new TreeLinkNode[vals.length];
    	nodes[0] = new TreeLinkNode(vals[0]);
    	for (int i = 1; i + i < vals.length; i++) {
    		if (vals[i * 2] > 0) {
    			nodes[i] = new TreeLinkNode(vals[i * 2]);
                if (i % 2 == 1) {
                    nodes[(i+1) / 2 - 1].left = nodes[i];
                } else {
                    nodes[(i+1) / 2 - 1].right = nodes[i];
                }
    		}
    	}
    	for (int i = 1; i + i < vals.length; i++) {
    		if (vals[i * 2 + 1] >= 0) {
    			nodes[i].next = nodes[vals[i * 2 + 1]];
    		}
    	}

    	return nodes[0];
    }

    public boolean equals(Object that) {
    	if (that instanceof TreeLinkNode) {
    		return equals(this, (TreeLinkNode) that);
    	}
    	return false;
    }

	public boolean equals(TreeLinkNode src, TreeLinkNode dst) {
		if (src == null && dst == null) {
			return true;
		}
		if (src == null || dst == null || src.val != dst.val) {
			return false;
		}
		if ((src.next == null || dst.next == null) && src.next != dst.next
			|| src.next != null && src.next.val != dst.next.val) {
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
		if (next != null) {
			sb.append("->");
			sb.append(next.val);
		}
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

