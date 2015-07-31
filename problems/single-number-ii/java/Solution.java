public class Solution {
    public int singleNumber(int[] A) {
        int ans = 0;
        
        for (int i = 0, mask = 1; i < 32; i++, mask <<= 1) {
            int cnt = 0;
            for (int j = 0; j < A.length; j++) {
                if ((A[j] & mask) != 0) {
                    cnt++;
                }
            }
            if (cnt % 3 != 0) {
                ans |= mask;
            }
        }
        
        return ans;
    }
}
