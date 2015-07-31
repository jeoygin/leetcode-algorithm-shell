// public class Solution {
//     public int[] searchRange(int[] A, int target) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<int[]>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, new int[]{3, 4}, new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
            }
            case 1: {
                return verifyCase(casenum, new int[]{-1, -1}, new Solution().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 9));
            }
            case 2: {
                return verifyCase(casenum, new int[]{0, 1}, new Solution().searchRange(new int[]{2, 2}, 2));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
