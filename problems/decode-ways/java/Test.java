// public class Solution {
//     public int numDecodings(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 2, new Solution().numDecodings("12"));
            }
            case 1: {
                return verifyCase(casenum, 0, new Solution().numDecodings(""));
            }
            case 2: {
                return verifyCase(casenum, 0, new Solution().numDecodings("0"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
