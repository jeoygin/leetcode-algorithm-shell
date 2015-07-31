// public class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 0, new Solution().canCompleteCircuit(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}));
            }
            case 1: {
                return verifyCase(casenum, 3, new Solution().canCompleteCircuit(new int[]{1, 2, 3, 4}, new int[]{2, 3, 4, 1}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
