// public class Solution {
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, 2, new Solution().uniquePathsWithObstacles(new int[][]{{0,0,0},{0,1,0},{0,0,0}}));
            }
            case 1: {
                return verifyCase(casenum, 0, new Solution().uniquePathsWithObstacles(new int[][]{{0},{1}}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
