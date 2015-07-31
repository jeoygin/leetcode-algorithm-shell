// public class Solution {
//     public int evalRPN(String[] tokens) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 9, new Solution().evalRPN(new String[]{"2", "1", "+", "3", "*"}));
            }
            case 1: {
                return verifyCase(casenum, 6, new Solution().evalRPN(new String[]{"4", "13", "5", "/", "+"}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
