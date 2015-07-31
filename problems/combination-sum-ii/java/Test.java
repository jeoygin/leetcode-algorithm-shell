// public class Solution {
//     public List<List<Integer>> combinationSum2(int[] num, int target) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<Integer>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> ans = new ArrayList<List<Integer>>();
                ans.add(Arrays.asList(1, 1, 6));
                ans.add(Arrays.asList(1, 2, 5));
                ans.add(Arrays.asList(1, 7));
                ans.add(Arrays.asList(2, 6));
                return verifyCase(casenum, ans, new Solution().combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
