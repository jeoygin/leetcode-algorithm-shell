// public class Solution {
//     public int strStr(String haystack, String needle) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 6, new Solution().strStr("Hello world!", "world"));
            }
            case 1: {
                return verifyCase(casenum, 1, new Solution().strStr("mississippi", "issi"));
            }
            
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
