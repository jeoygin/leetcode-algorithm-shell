// public class Solution {
//     public List<List<Integer>> threeSum(int[] num) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<Integer>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> ans = new ArrayList<List<Integer>>();
                ans.add(Arrays.asList(-1, -1, 2));
                ans.add(Arrays.asList(-1, 0, 1));
                return verifyCase(casenum, ans, new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
