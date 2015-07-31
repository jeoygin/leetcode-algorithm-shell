// public class Solution {
//     public int candy(int[] ratings) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 15, new Solution().candy(new int[]{1, 2, 3, 4, 5}));
            }
            case 1: {
                return verifyCase(casenum, 9, new Solution().candy(new int[]{1, 2, 3, 2, 1}));
            }
            case 2: {
                return verifyCase(casenum, 10, new Solution().candy(new int[]{1, 2, 3, 2, 2, 1}));
            }
            case 3: {
                return verifyCase(casenum, 4, new Solution().candy(new int[]{1, 2, 2}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
