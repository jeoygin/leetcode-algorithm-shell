// public class Solution {
//     public int longestValidParentheses(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 2, new Solution().longestValidParentheses("(()"));
            }
            case 1: {
                return verifyCase(casenum, 4, new Solution().longestValidParentheses(")()())"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
