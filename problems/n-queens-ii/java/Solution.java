public class Solution {
    private int n;
    private int ans = 0;
    
    void search(int r, int col, int lr, int rl) {
        if (r == n) {
            ans++;
            return;
        }

        for (int mask = ((1 << n) - 1) & ~(col | lr | rl); mask > 0; mask &= mask - 1) {
            int x = mask & ~(mask - 1);
            search(r + 1, col | x, (lr | x) >> 1, (rl | x) << 1);
        }
    }
    
    public int totalNQueens(int n) {
        this.n = n;
        search(0, 0, 0, 0);
        return ans;
    }
}
