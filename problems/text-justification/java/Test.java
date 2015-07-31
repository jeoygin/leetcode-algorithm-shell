// public class Solution {
//     public List<String> fullJustify(String[] words, int L) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<String>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<String> ans = Arrays.asList("This    is    an", "example  of text", "justification.  ");
                return verifyCase(casenum, ans, new Solution().fullJustify(
                    new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
