import java.util.*;
public class UndirectedGraphNode implements Comparable<UndirectedGraphNode> {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { 
        label = x; 
        neighbors = new ArrayList<UndirectedGraphNode>(); 
    }

    public boolean equals(Object that) {
        if (that instanceof UndirectedGraphNode && that != null) {
            return equals(this, ((UndirectedGraphNode) that));
        }
        return false;
    }

    public boolean equals(UndirectedGraphNode src, UndirectedGraphNode dst) {
        if (src == null && dst == null) {
            return true;
        }

        if ((src == null || dst == null) && src != dst) {
            return false;
        }

        if (src.label != dst.label) {
            return false;
        }

        return src.toString().equals(dst.toString());
    }

    public String toString() {
        LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        Map<UndirectedGraphNode, List<Integer>> map = new HashMap<UndirectedGraphNode, List<Integer>>();   
        List<UndirectedGraphNode> nodes = new ArrayList<UndirectedGraphNode>();

        queue.offer(this);
        map.put(this, new ArrayList<Integer>());
        while (!queue.isEmpty()) {
            UndirectedGraphNode node = queue.poll();
            nodes.add(node);
            List<Integer> neighborLabels = map.get(node);
            
            for (UndirectedGraphNode neighbor: node.neighbors) {
                if (map.get(neighbor) == null) {
                    map.put(neighbor, new ArrayList<Integer>());
                    queue.offer(neighbor);
                }
                neighborLabels.add(neighbor.label);
            }
        }

        Collections.sort(nodes);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nodes.size(); i++) {
            UndirectedGraphNode node = nodes.get(i);
            if (i > 0) {
                sb.append("#");
            }
            sb.append(node.label);
            Collections.sort(map.get(node));
            for (int label: map.get(node)) {
                sb.append("," + label);
            }
        }
        return sb.toString();
    }

    public static UndirectedGraphNode create(String str) {
        String[] nodeStrs = str.split("#");
        List<Integer>[] nodes = new List[nodeStrs.length];

        for (int i = 0; i < nodeStrs.length; i++) {
            String[] labels = nodeStrs[i].split(",");
            nodes[i] = new ArrayList<Integer>();
            for (String label: labels) {
                nodes[i].add(Integer.parseInt(label));
            }
        }

        return create(nodes);
    }

    public static UndirectedGraphNode create(List<Integer>... nodes) {
        Map<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();
        Map<Integer, Set<Integer>> neighborMap = new HashMap<Integer, Set<Integer>>();
        UndirectedGraphNode ret = null;

        for (int i = 0; i < nodes.length; i++) {
            List<Integer> neighborList = nodes[i];
            UndirectedGraphNode node = new UndirectedGraphNode(neighborList.get(0));
            if (ret == null) {
                ret = node;
            }
            map.put(node.label, node);
            if (neighborMap.get(node.label) == null) {
                neighborMap.put(node.label, new HashSet<Integer>());
            }
            Set<Integer> neighbors = neighborMap.get(node.label);
            for (int j = 1; j < neighborList.size(); j++) {
                int neighbor = neighborList.get(j);
                neighbors.add(neighbor);
                if (neighborMap.get(neighbor) == null) {
                    neighborMap.put(neighbor, new HashSet<Integer>());
                }
                neighborMap.get(neighbor).add(node.label);
            }
        }

        for (int i = 0; i < nodes.length; i++) {
            List<Integer> neighborList = nodes[i];
            Set<Integer> neighbors = neighborMap.get(neighborList.get(0));
            UndirectedGraphNode node = map.get(neighborList.get(0));
            for (int neighbor: neighbors) {
                if (map.get(neighbor) != null) {
                    node.neighbors.add(map.get(neighbor));
                }
            }
        }

        return ret;
    }

    public int compareTo(UndirectedGraphNode that) {
        return this.label - that.label;
    }
};