// public class Solution {
//     public double pow(double x, int n) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Double>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 256.0, new Solution().pow(2, 8));
            }
            case 1: {
                return verifyCase(casenum, 0.00003, new Solution().pow(34.00515, -3));
            }
            case 2: {
                return verifyCase(casenum, 1.0, new Solution().pow(1.00000, -2147483648));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
