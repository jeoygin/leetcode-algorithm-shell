// public class Solution {
//     public String multiply(String num1, String num2) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<String>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, "56088", new Solution().multiply("123", "456"));
            }
            case 1: {
                return verifyCase(casenum, "0", new Solution().multiply("123", "0"));
            }
            case 2: {
                return verifyCase(casenum, "0", new Solution().multiply("0", "456"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
