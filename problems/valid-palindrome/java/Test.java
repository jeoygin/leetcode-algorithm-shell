// public class Solution {
//     public boolean isPalindrome(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, true, new Solution().isPalindrome("A man, a plan, a canal: Panama"));
            }
            case 1: {
                return verifyCase(casenum, false, new Solution().isPalindrome("race a car"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
