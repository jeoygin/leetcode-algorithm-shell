// public class Solution {
//     public String minWindow(String S, String T) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<String>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, "BANC", new Solution().minWindow("ADOBECODEBANC", "ABC"));
            }
            case 1: {
                return verifyCase(casenum, "", new Solution().minWindow("ADOBECODEBANC", "ABCZ"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
