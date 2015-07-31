// public class Solution {
//     public List<Integer> findSubstring(String S, String[] L) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<String>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, Arrays.asList(0, 9), new Solution().findSubstring("barfoothefoobarman", new String[]{"foo", "bar"}));
            }
            case 1: {
                return verifyCase(casenum, Arrays.asList(13), new Solution().findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", 
                    new String[]{"fooo", "barr", "wing", "ding", "wing"}));
            }
            case 2: {
                return verifyCase(casenum, Arrays.asList(0, 2, 4), new Solution().findSubstring("abababab", 
                    new String[]{"a","b","a"}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
