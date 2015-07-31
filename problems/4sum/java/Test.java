// public class Solution {
//     public List<List<Integer>> fourSum(int[] num, int target) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<Integer>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> res = new ArrayList<List<Integer>>();
                res.add(Arrays.asList(-2, -1, 1, 2));
                res.add(Arrays.asList(-2,  0, 0, 2));
                res.add(Arrays.asList(-1,  0, 0, 1));
                return verifyCase(casenum, res, new Solution().fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
            }
            case 1: {
                List<List<Integer>> res = new ArrayList<List<Integer>>();
                res.add(Arrays.asList(-4,0,1,2));
                res.add(Arrays.asList(-1,-1,0,1));
                return verifyCase(casenum, res, new Solution().fourSum(new int[]{-1,0,1,2,-1,-4}, -1));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
