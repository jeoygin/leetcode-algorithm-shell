// /**
//  * Definition for singly-linked list with a random pointer.
//  * class RandomListNode {
//  *     int label;
//  *     RandomListNode next, random;
//  *     RandomListNode(int x) { this.label = x; }
//  * };
//  */
// public class Solution {
//     public RandomListNode copyRandomList(RandomListNode head) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<RandomListNode>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                RandomListNode head = RandomListNode.createWithRandom(1, 3, 2, 5, 3, 2, 4, 4, 5, 0, 6, 1);
                return verifyCase(casenum, head, new Solution().copyRandomList(head));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
