public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length, remain = 0, start = 0, end = -1;
        while (start < n && end - start < n) {
            end++;
            remain += gas[end % n] - cost[end % n];
            while (remain < 0 && start <= end) {
                remain -= gas[start % n] - cost[start % n];
                start++;
            }
        }
        return end - start == n ? start : -1;
    }
}
