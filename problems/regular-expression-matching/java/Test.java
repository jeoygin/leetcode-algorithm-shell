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
                return verifyCase(casenum, true, new Solution().isMatch("aa", ".*"));
            }
            case 4: {
                return verifyCase(casenum, true, new Solution().isMatch("ab", ".*"));
            }
            case 5: {
                return verifyCase(casenum, true, new Solution().isMatch("aab", "c*a*b*"));
            }
            case 6: {
                return verifyCase(casenum, true, new Solution().isMatch("aasdfasdfasdfasdfas", "aasdf.*asdf.*asdf.*asdf.*s"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
