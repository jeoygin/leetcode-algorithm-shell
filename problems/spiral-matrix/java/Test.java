/*
public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
    }
}
*/
import java.util.*;
public class Test extends TestCase<List<Integer>>{
    public int runTestCase(int casenum) {
        int[][] matrix3x3 = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrix4x4 = new int[][] {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, Arrays.asList(1,2,3,6,9,8,7,4,5), new Solution().spiralOrder(matrix3x3));
            }
            case 1: {
                return verifyCase(casenum, Arrays.asList(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10), new Solution().spiralOrder(matrix4x4));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
