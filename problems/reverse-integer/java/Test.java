// public class Solution {
//     public int reverse(int x) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 321, new Solution().reverse(123));
            }
            case 1: {
                return verifyCase(casenum, -321, new Solution().reverse(-123));
            }
            case 2: {
                return verifyCase(casenum, 0, new Solution().reverse(1000000003));
            }
            case 3: {
                return verifyCase(casenum, -2147483641, new Solution().reverse(-1463847412));
            }

            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
