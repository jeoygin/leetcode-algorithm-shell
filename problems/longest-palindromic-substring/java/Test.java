// public class Solution {
//     public String longestPalindrome(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<String>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, "aba", new Solution().longestPalindrome("aabacc"));
            }
            case 1: {
                return verifyCase(casenum, "abba", new Solution().longestPalindrome("aabbacc"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
