// public class Solution {
//     public int firstMissingPositive(int[] A) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 3, new Solution().firstMissingPositive(new int[]{1, 2, 0}));
            }
            case 1: {
                return verifyCase(casenum, 2, new Solution().firstMissingPositive(new int[]{3,4,-1,1}));
            }
            case 2: {
                return verifyCase(casenum, 4, new Solution().firstMissingPositive(new int[]{1, 1, 2, 3}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
