// public class Solution {
//     public List<String> wordBreak(String s, Set<String> dict) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<String>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                Set<String> dict = new HashSet<String>();
                Collections.addAll(dict, "cat", "cats", "and", "sand", "dog");
                return verifyCase(casenum, Arrays.asList("cats and dog", "cat sand dog"), new Solution().wordBreak("catsanddog", dict));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
