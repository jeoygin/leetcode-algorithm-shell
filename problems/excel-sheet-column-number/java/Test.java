// public class Solution {
//     public int titleToNumber(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 1, new Solution().titleToNumber("A"));
            }
            case 1: {
                return verifyCase(casenum, 26, new Solution().titleToNumber("Z"));
            }
            case 2: {
                return verifyCase(casenum, 28, new Solution().titleToNumber("AB"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
