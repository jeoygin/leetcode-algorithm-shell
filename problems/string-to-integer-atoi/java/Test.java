// public class Solution {
//     public int atoi(String str) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 1, new Solution().atoi("     +1abc"));
            }
            case 1: {
                return verifyCase(casenum, -1, new Solution().atoi("-1"));
            }
            case 2: {
                return verifyCase(casenum, 0, new Solution().atoi("   a1"));
            }
            case 3: {
                return verifyCase(casenum, 2147483647, new Solution().atoi("2147483647"));
            }
            case 4: {
                return verifyCase(casenum, 2147483647, new Solution().atoi("2147483648"));
            }
            case 5: {
                return verifyCase(casenum, -2147483648, new Solution().atoi("-2147483648"));
            }
            case 6: {
                return verifyCase(casenum, -2147483648, new Solution().atoi("-2147483649"));
            }
            case 7: {
                return verifyCase(casenum, 2147483646, new Solution().atoi("2147483646"));
            }
            case 8: {
                return verifyCase(casenum, -2147483647, new Solution().atoi("-2147483647"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
