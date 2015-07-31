// public class Solution {
//     public void nextPermutation(int[] num) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<int[]>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                int[] num = new int[]{1, 2, 3};
                new Solution().nextPermutation(num);
                return verifyCase(casenum, new int[]{1, 3, 2}, num);
            }
            case 1: {
                int[] num = new int[]{1, 3, 2};
                new Solution().nextPermutation(num);
                return verifyCase(casenum, new int[]{2, 1, 3}, num);
            }
            case 2: {
                int[] num = new int[]{3, 2, 1};
                new Solution().nextPermutation(num);
                return verifyCase(casenum, new int[]{1, 2, 3}, num);
            }
            case 3: {
                int[] num = new int[]{1, 1, 5};
                new Solution().nextPermutation(num);
                return verifyCase(casenum, new int[]{1, 5, 1}, num);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
