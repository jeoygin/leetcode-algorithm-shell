public class Solution {
    private int n;
    private List<String[]> list;
    private int[] row;
    private char[] ptn;
    
    void search(int r, int col, int lr, int rl) {
        if (r == n) {
            String[] puzzle = new String[n];
            for (int i = 0; i < n; i++) {
                ptn[row[i]] = 'Q';
                puzzle[i] = new String(ptn);
                ptn[row[i]] = '.';
            }
            list.add(puzzle);
            return;
        }
        
        int mask = ((1 << n) - 1) & ~(col | lr | rl);
        for (int c = 0; c < n; c++) {
            int x = 1 << c;
            if ((mask & x) > 0) {
                row[r] = c;
                search(r + 1, col | x, (lr | x) >> 1, (rl | x) << 1);
            }
        }
    }
    public List<String[]> solveNQueens(int n) {
        this.n = n;
        list = new ArrayList<String[]>();
        row = new int[n];
        ptn = new char[n];
        Arrays.fill(ptn, '.');
        search(0, 0, 0, 0);
        return list;
    }
}
