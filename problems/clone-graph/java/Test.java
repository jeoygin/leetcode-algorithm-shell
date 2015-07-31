// /**
//  * Definition for undirected graph.
//  * class UndirectedGraphNode {
//  *     int label;
//  *     List<UndirectedGraphNode> neighbors;
//  *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
//  * };
//  */
// public class Solution {
//     public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<UndirectedGraphNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                UndirectedGraphNode node = UndirectedGraphNode.create("0,1,2#1,2#2,2");
                return verifyCase(casenum, node, new Solution().cloneGraph(node));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
