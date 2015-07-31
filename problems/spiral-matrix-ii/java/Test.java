/*
public class Solution {
    public int[][] generateMatrix(int n) {
        
    }
}
*/
import java.util.*;
public class Test extends TestCase<int[][]>{
    public int runTestCase(int casenum) {
        int[][] matrix3x3 = new int[][]{
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
        };
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, matrix3x3, new Solution().generateMatrix(3));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
