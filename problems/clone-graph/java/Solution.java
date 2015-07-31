/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
import java.util.*;
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        LinkedList<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        Map<Integer, UndirectedGraphNode> map = new HashMap<Integer, UndirectedGraphNode>();

        queue.offer(node);
        UndirectedGraphNode ret = new UndirectedGraphNode(node.label);
        map.put(node.label, ret);

        while (!queue.isEmpty()) {
            node = queue.poll();
            UndirectedGraphNode cloneNode = map.get(node.label);
            for (UndirectedGraphNode neighbor: node.neighbors) {
                UndirectedGraphNode cloneNeighbor = map.get(neighbor.label);
                if (cloneNeighbor == null) {
                    cloneNeighbor = new UndirectedGraphNode(neighbor.label);
                    map.put(neighbor.label, cloneNeighbor);
                    queue.offer(neighbor);
                }
                cloneNode.neighbors.add(cloneNeighbor);
            }
        }

        return ret;
    }
}
