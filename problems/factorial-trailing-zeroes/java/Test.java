// public class Solution {
//     public int trailingZeroes(int n) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 0, new Solution().trailingZeroes(4));
            }
            case 1: {
                return verifyCase(casenum, 1, new Solution().trailingZeroes(5));
            }
            case 2: {
                return verifyCase(casenum, 2, new Solution().trailingZeroes(10));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
