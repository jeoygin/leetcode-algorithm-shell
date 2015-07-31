// public class Solution {
//     public boolean isMatch(String s, String p) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, true, new Solution().isMatch("aa", "aa"));
            }
            case 1: {
                return verifyCase(casenum, false, new Solution().isMatch("aaa", "aa"));
            }
            case 2: {
                return verifyCase(casenum, true, new Solution().isMatch("aa", "a*"));
            }
            case 3: {
                return verifyCase(casenum, true, new Solution().isMatch("aa", "a*"));
            }
            case 4: {
                return verifyCase(casenum, true, new Solution().isMatch("ab", "?*"));
            }
            case 5: {
                return verifyCase(casenum, false, new Solution().isMatch("aab", "c*a*b*"));
            }
            case 6: {
                return verifyCase(casenum, false, new Solution().isMatch("a", "aa"));
            }
            case 7: {
                return verifyCase(casenum, true, new Solution().isMatch("", "*"));
            }
            case 8: {
                return verifyCase(casenum, false, new Solution().isMatch("b", "?*?"));
            }
            case 9: {
                return verifyCase(casenum, true, new Solution().isMatch("ab", "*ab"));
            }
            case 10: {
                return verifyCase(casenum, true, new Solution().isMatch("ho", "**ho"));
            }
            case 11: {
                return verifyCase(casenum, true, new Solution().isMatch("mississippi", "m*issip*"));
            }
            case 12: {
                return verifyCase(casenum, true, new Solution().isMatch("hi", "?*"));
            }
            case 13: {
                return verifyCase(casenum, true, new Solution().isMatch("aaabbaabbaab", "*aabbaa*a*"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
