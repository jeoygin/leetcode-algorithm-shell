// public class Solution {
//     public boolean isNumber(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, true, new Solution().isNumber("0"));
            }
            case 1: {
                return verifyCase(casenum, true, new Solution().isNumber(" 0.1 "));
            }
            case 2: {
                return verifyCase(casenum, false, new Solution().isNumber("abc"));
            }
            case 3: {
                return verifyCase(casenum, false, new Solution().isNumber("1 a"));
            }
            case 4: {
                return verifyCase(casenum, true, new Solution().isNumber("2e10"));
            }
            case 5: {
                return verifyCase(casenum, false, new Solution().isNumber("."));
            }
            case 6: {
                return verifyCase(casenum, false, new Solution().isNumber("e9"));
            }
            case 7: {
                return verifyCase(casenum, true, new Solution().isNumber("3."));
            }
            case 8: {
                return verifyCase(casenum, true, new Solution().isNumber(".3"));
            }
            case 9: {
                return verifyCase(casenum, false, new Solution().isNumber(". 1"));
            }
            case 10: {
                return verifyCase(casenum, false, new Solution().isNumber(".-4"));
            }
            case 11: {
                return verifyCase(casenum, true, new Solution().isNumber("   005047e+6"));
            }
            
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
