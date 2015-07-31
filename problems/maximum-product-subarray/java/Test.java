// public class Solution {
//     public int maxProduct(int[] A) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 6, new Solution().maxProduct(new int[]{2, 3, -2, 4}));
            }
            case 1: {
                return verifyCase(casenum, -2, new Solution().maxProduct(new int[]{-2}));
            }
            case 2: {
                return verifyCase(casenum, 0, new Solution().maxProduct(new int[]{-2, 0, -4}));
            }
            case 3: {
                return verifyCase(casenum, 16, new Solution().maxProduct(new int[]{-2, 1, -4, 2}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
