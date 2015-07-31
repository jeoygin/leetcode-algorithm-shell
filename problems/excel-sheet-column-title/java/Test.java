// public class Solution {
//     public String convertToTitle(int n) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<String>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, "A", new Solution().convertToTitle(1));
            }
            case 1: {
                return verifyCase(casenum, "Z", new Solution().convertToTitle(26));
            }
            case 2: {
                return verifyCase(casenum, "AA", new Solution().convertToTitle(27));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
