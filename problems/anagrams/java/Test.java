// public class Solution {
//     public List<String> anagrams(String[] strs) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<String>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, Arrays.asList("cat", "tac", "dog", "god"), new Solution().anagrams(new String[]{"dog", "cat", "tac", "god"}));
            }
            case 1: {
                return verifyCase(casenum, Arrays.asList("", ""), new Solution().anagrams(new String[]{"", ""}));
            }
            case 2: {
                return verifyCase(casenum, Arrays.asList("ant", "ant"), new Solution().anagrams(new String[]{"ant", "ant"}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
