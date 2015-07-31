// public class Solution {
//     public int threeSumClosest(int[] num, int target) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 2, new Solution().threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
            }
            case 1: {
                return verifyCase(casenum, 3, new Solution().threeSumClosest(new int[]{0, 1, 2}, 3));
            }
            case 2: {
                return verifyCase(casenum, 3, new Solution().threeSumClosest(new int[]{0, 1, 2}, 0));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
