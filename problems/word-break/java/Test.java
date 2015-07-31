// public class Solution {
//     public boolean wordBreak(String s, Set<String> dict) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Boolean>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                Set<String> dict = new HashSet<String>();
                dict.add("leet");
                dict.add("code");
                return verifyCase(casenum, true, new Solution().wordBreak("leetcode", dict));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
