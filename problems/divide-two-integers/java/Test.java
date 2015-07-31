// public class Solution {
//     public int divide(int dividend, int divisor) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, Integer.MAX_VALUE, new Solution().divide(Integer.MIN_VALUE, -1));
            }
            case 1: {
                return verifyCase(casenum, 0, new Solution().divide(0, -1));
            }
            case 2: {
                return verifyCase(casenum, Integer.MAX_VALUE, new Solution().divide(Integer.MAX_VALUE, 1));
            }
            case 3: {
                return verifyCase(casenum, 2, new Solution().divide(9, 4));
            }
            case 4: {
                return verifyCase(casenum, -2, new Solution().divide(-9, 4));
            }
            case 5: {
                return verifyCase(casenum, -2, new Solution().divide(9, -4));
            }
            case 6: {
                return verifyCase(casenum, 2, new Solution().divide(-9, -4));
            }
            case 7: {
                return verifyCase(casenum, -1073741824, new Solution().divide(-2147483648, 2));
            }
            case 8: {
                return verifyCase(casenum, -1, new Solution().divide(1, -1));
            }
            case 9: {
                return verifyCase(casenum, -2147483648, new Solution().divide(-2147483648, 1));
            }
            case 10: {
                return verifyCase(casenum, 1073741823, new Solution().divide(2147483647, 2));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
