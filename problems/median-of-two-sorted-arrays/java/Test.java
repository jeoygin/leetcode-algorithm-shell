// public class Solution {
//     public double findMedianSortedArrays(int A[], int B[]) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Double>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 3.5, new Solution().findMedianSortedArrays(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
            }
            case 1: {
                return verifyCase(casenum, 3.5, new Solution().findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
            }
            case 2: {
                return verifyCase(casenum, 6.5, new Solution().findMedianSortedArrays(new int[]{7, 8, 9}, new int[]{4, 5, 6}));
            }
            case 3: {
                return verifyCase(casenum, 4.0, new Solution().findMedianSortedArrays(new int[]{1, 3, 5, 7}, new int[]{2, 4, 6}));
            }
            case 4: {
                return verifyCase(casenum, 2.5, new Solution().findMedianSortedArrays(new int[]{1, 4}, new int[]{2, 3}));
            }
            case 5: {
                return verifyCase(casenum, 1.5, new Solution().findMedianSortedArrays(new int[]{1, 2}, new int[]{1, 2}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
