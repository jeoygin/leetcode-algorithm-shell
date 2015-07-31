// public class Solution {
//     public boolean isValid(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, true, new Solution().isValid("()"));
            }
            case 1: {
                return verifyCase(casenum, true, new Solution().isValid("()[]{}"));
            }
            case 2: {
                return verifyCase(casenum, false, new Solution().isValid("(]"));
            }
            case 3: {
                return verifyCase(casenum, false, new Solution().isValid("([)]"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
