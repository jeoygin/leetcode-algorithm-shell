// public class Solution {
//     public List<String> letterCombinations(String digits) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<String>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), 
                    new Solution().letterCombinations("23"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
