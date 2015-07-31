// public class Solution {
//     public List<List<String>> partition(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<String>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<String>> ans = new ArrayList<List<String>>();
                ans.add(Arrays.asList("a", "a", "b"));
                ans.add(Arrays.asList("aa", "b"));
                return verifyCase(casenum, ans, new Solution().partition("aab"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
