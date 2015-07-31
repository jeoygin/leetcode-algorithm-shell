// public class Solution {
//     public int maximumGap(int[] num) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 2, new Solution().maximumGap(new int[]{1, 3, 5, 7}));
            }
            case 1: {
                return verifyCase(casenum, 3, new Solution().maximumGap(new int[]{1, 3, 6, 7}));
            }
            case 2: {
                return verifyCase(casenum, 4, new Solution().maximumGap(new int[]{1,1,1,1,1,5,5,5,5,5}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
