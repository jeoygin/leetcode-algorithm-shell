// public class Solution {
//     public int maxProfit(int[] prices) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 2, new Solution().maxProfit(new int[]{2,1,2,0,1}));
            }
            case 1: {
                return verifyCase(casenum, 1, new Solution().maxProfit(new int[]{1, 2}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
