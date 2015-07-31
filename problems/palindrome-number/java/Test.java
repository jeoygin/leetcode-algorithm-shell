// public class Solution {
//     public boolean isPalindrome(int x) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, false, new Solution().isPalindrome(-1));
            }
            case 1: {
                return verifyCase(casenum, true, new Solution().isPalindrome(100000001));
            }
            case 2: {
                return verifyCase(casenum, false, new Solution().isPalindrome(-100000001));
            }
            case 3: {
                return verifyCase(casenum, false, new Solution().isPalindrome(10));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
