import java.util.*;
public class RandomListNode {
    int label;
    RandomListNode next, random;
    RandomListNode(int x) { 
        this.label = x; 
    }

    public boolean equals(Object that) {
        if (that instanceof RandomListNode && that != null) {
            return equals(this, ((RandomListNode) that));
        }
        return false;
    }

    public boolean equals(RandomListNode src, RandomListNode dst) {
        if (src == null && dst == null) {
            return true;
        }

        if ((src == null || dst == null) && src != dst) {
            return false;
        }

        if (src.label != dst.label) {
            return false;
        }

        if ((src.random == null || dst.random == null) && src.random != dst.random 
            || src.random.label != dst.random.label) {
            return false;
        }

        return equals(src.next, dst.next);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(label);
        RandomListNode p = next;
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        map.put(this, this);
        while (p != null && map.get(p) == null) {
            sb.append("->");
            sb.append(p.label);
            map.put(p, p);
            p = p.next;
        }
        if (p != null) {
            sb.append("->");
            sb.append(p.label);
            sb.append("...");
        }
        sb.append("]");
        return sb.toString();
    }

    public static RandomListNode create(int... vals) {
        if (vals.length == 0) {
            return null;
        }
        int n = vals.length;
        List<RandomListNode> list = new ArrayList<RandomListNode>();
        for (int i = 0; i < n; i++) {
            list.add(new RandomListNode(vals[i]));
        }
        for (int i = 0; i + 1< n; i++) {
            list.get(i).next = list.get(i+1);
        }

        return list.get(0);
    }

    public static RandomListNode createWithRandom(int... vals) {
        if (vals.length == 0) {
            return null;
        }
        if (vals.length % 2 == 1) {
            throw new IllegalArgumentException("The number of arguments should be even");
        }
        int n = vals.length / 2;
        List<RandomListNode> list = new ArrayList<RandomListNode>();
        for (int i = 0; i < n; i++) {
            list.add(new RandomListNode(vals[i*2]));
        }
        for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                list.get(i).next = list.get(i+1);
            }
            if (vals[i*2+1] >= 0) {
                list.get(i).random = list.get(vals[i*2+1]);
            }
        }

        return list.get(0);
    }
}