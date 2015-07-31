// public class Solution {
//     public List<List<Integer>> permuteUnique(int[] num) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<List<Integer>>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                List<List<Integer>> ans = new ArrayList<List<Integer>>();
                ans.add(Arrays.asList(1, 1, 2));
                ans.add(Arrays.asList(1, 2, 1));
                ans.add(Arrays.asList(2, 1, 1));
                return verifyCase(casenum, ans, new Solution().permuteUnique(new int[]{1, 1, 2}));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
