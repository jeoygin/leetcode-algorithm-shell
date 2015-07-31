// public class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 3, new Solution().lengthOfLongestSubstring("abcabcbb"));
            }
            case 1: {
                return verifyCase(casenum, 1, new Solution().lengthOfLongestSubstring("bbbbbb"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
