// public class Solution {
//     public String simplifyPath(String path) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<String>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, "/home", new Solution().simplifyPath("/home/"));
            }
            case 1: {
                return verifyCase(casenum, "/c", new Solution().simplifyPath("/a/./b/../../c/"));
            }
            case 2: {
                return verifyCase(casenum, "/", new Solution().simplifyPath("/../"));
            }
            case 3: {
                return verifyCase(casenum, "/home/foo", new Solution().simplifyPath("/home//foo/"));
            }
            case 4: {
                return verifyCase(casenum, "/...", new Solution().simplifyPath("/..."));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
