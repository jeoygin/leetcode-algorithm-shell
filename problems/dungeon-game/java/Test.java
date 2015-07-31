// public class Solution {
//     public int calculateMinimumHP(int[][] dungeon) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<Integer>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                int[][] dungeon = new int[][] {
                    {-2, -3, 3},
                    {-5, -10, 1},
                    {10, 30, -5}
                };
                return verifyCase(casenum, 7, new Solution().calculateMinimumHP(dungeon));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
