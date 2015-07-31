// public class Solution {
//     public String fractionToDecimal(int numerator, int denominator) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<String>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, "0.5", new Solution().fractionToDecimal(1, 2));
            }
            case 1: {
                return verifyCase(casenum, "2", new Solution().fractionToDecimal(2, 1));
            }
            case 2: {
                return verifyCase(casenum, "0.(6)", new Solution().fractionToDecimal(2, 3));
            }
            case 3: {
                return verifyCase(casenum, "0.1(6)", new Solution().fractionToDecimal(1, 6));
            }
            case 4: {
                return verifyCase(casenum, "-0.2", new Solution().fractionToDecimal(1, -5));
            }
            case 5: {
                return verifyCase(casenum, "-0.2", new Solution().fractionToDecimal(-1, 5));
            }
            case 6: {
                return verifyCase(casenum, "0.2", new Solution().fractionToDecimal(1, 5));
            }
            case 7: {
                return verifyCase(casenum, "0", new Solution().fractionToDecimal(0, -5));
            }
            case 8: {
                return verifyCase(casenum, "0.0000000004656612873077392578125", new Solution().fractionToDecimal(-1, -2147483648));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
