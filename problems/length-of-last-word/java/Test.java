// public class Solution {
//     public int lengthOfLastWord(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 5, new Solution().lengthOfLastWord("Hi World"));
            }
            case 1: {
                return verifyCase(casenum, 5, new Solution().lengthOfLastWord("Hello World "));
            }
            case 2: {
                return verifyCase(casenum, 0, new Solution().lengthOfLastWord(" "));
            }

            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
