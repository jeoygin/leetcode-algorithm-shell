// public class Solution {
//     public int compareVersion(String version1, String version2) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, -1, new Solution().compareVersion("0.1", "1.1"));
            }
            case 1: {
                return verifyCase(casenum, -1, new Solution().compareVersion("0", "1"));
            }
            case 2: {
                return verifyCase(casenum, 1, new Solution().compareVersion("13.37", "1.2"));
            }
            case 3: {
                return verifyCase(casenum, 0, new Solution().compareVersion("1.1.1", "1.1.1"));
            }
            case 4: {
                return verifyCase(casenum, 0, new Solution().compareVersion("1.0", "1"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
