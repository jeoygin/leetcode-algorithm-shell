// public class Solution {
//     public int ladderLength(String start, String end, Set<String> dict) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                Set<String> dict = new HashSet<String>();
                Collections.addAll(dict, "hot","dot","dog","lot","log");
                return verifyCase(casenum, 5, new Solution().ladderLength("hit", "cog", dict));
            }
            case 1: {
                Set<String> dict = new HashSet<String>();
                Collections.addAll(dict, "a","b","c");
                return verifyCase(casenum, 2, new Solution().ladderLength("a", "c", dict));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
