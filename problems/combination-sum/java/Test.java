// public class Solution {
//     public List<List<Integer>> combinationSum(int[] candidates, int target) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<Integer>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> ans = new ArrayList<List<Integer>>();
                ans.add(Arrays.asList(2, 2, 3));
                ans.add(Arrays.asList(7));
                return verifyCase(casenum, ans, new Solution().combinationSum(new int[]{2, 3, 6, 7}, 7));
            }
            case 1: {
                List<List<Integer>> ans = new ArrayList<List<Integer>>();
                ans.add(Arrays.asList(1, 1));
                return verifyCase(casenum, ans, new Solution().combinationSum(new int[]{1}, 2));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
