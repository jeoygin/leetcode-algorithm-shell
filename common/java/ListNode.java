import java.util.*;
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    public boolean equals(Object that) {
    	if (that instanceof ListNode && that != null) {
    		return equals(this, ((ListNode) that));
    	}
    	return false;
    }

    public boolean equals(ListNode src, ListNode dst) {
    	if (src == null && dst == null) {
    		return true;
    	}

    	if ((src == null || dst == null) && src != dst) {
    		return false;
    	}

    	if (src.val != dst.val) {
    		return false;
    	}

    	return equals(src.next, dst.next);
    }

    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("[");
    	sb.append(val);
    	ListNode p = next;
    	Map<ListNode, ListNode> map = new HashMap<ListNode, ListNode>();
    	map.put(this, this);
    	while (p != null && map.get(p) == null) {
    		sb.append("->");
    		sb.append(p.val);
    		map.put(p, p);
    		p = p.next;
    	}
    	if (p != null) {
    		sb.append("->");
    		sb.append(p.val);
    		sb.append("...");
    	}
    	sb.append("]");
    	return sb.toString();
    }

    public static ListNode create(int... vals) {
    	if (vals.length == 0) {
    		return null;
    	}
    	int n = vals.length;
    	List<ListNode> list = new ArrayList<ListNode>();
    	for (int i = 0; i < n; i++) {
    		list.add(new ListNode(vals[i]));
    	}
    	for (int i = 0; i + 1< n; i++) {
    		list.get(i).next = list.get(i+1);
    	}

    	return list.get(0);
    }

    public static ListNode createWithNext(int... vals) {
    	if (vals.length == 0) {
    		return null;
    	}
    	if (vals.length % 2 == 1) {
    		throw new IllegalArgumentException("The number of arguments should be even");
    	}
    	int n = vals.length / 2;
    	List<ListNode> list = new ArrayList<ListNode>();
    	for (int i = 0; i < n; i++) {
    		list.add(new ListNode(vals[i*2]));
    	}
    	for (int i = 0; i < n; i++) {
    		if (vals[i*2+1] < 0) {
    			if (i + 1 < n) {
    				list.get(i).next = list.get(i+1);
    			}
    		} else {
    			list.get(i).next = list.get(vals[i*2+1]);
    		}
    	}

    	return list.get(0);
    }
}
