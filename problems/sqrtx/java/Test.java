// public class Solution {
//     public int sqrt(int x) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 3, new Solution().sqrt(9));
            }
            case 1: {
                return verifyCase(casenum, 4, new Solution().sqrt(16));
            }
            case 2: {
                return verifyCase(casenum, 1<<15, new Solution().sqrt(1<<30));
            }
            case 3: {
                return verifyCase(casenum, 0, new Solution().sqrt(0));
            }
            case 4: {
                return verifyCase(casenum, 1, new Solution().sqrt(1));
            }
            case 5: {
                return verifyCase(casenum, 1, new Solution().sqrt(2));
            }
            case 6: {
                return verifyCase(casenum, 2, new Solution().sqrt(5));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
