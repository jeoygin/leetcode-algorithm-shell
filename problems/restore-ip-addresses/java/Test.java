// public class Solution {
//     public List<String> restoreIpAddresses(String s) {
//         
//     }
// }
import java.util.*;
public class Test extends TestCase<List<String>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                return verifyCase(casenum, Arrays.asList("255.255.11.135", "255.255.111.35"), new Solution().restoreIpAddresses("25525511135"));
            }
            case 1: {
                return verifyCase(casenum, Arrays.asList("0.10.0.10","0.100.1.0"), new Solution().restoreIpAddresses("010010"));
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
