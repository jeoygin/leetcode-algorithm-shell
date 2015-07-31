public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[9], col = new int[9], block = new int[9];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char num = board[r][c];
                if (num >= '1' && num <= '9') {
                    int mask = 1 << (num - '0');
                    if ((row[r] & mask) > 0 || (col[c] & mask) > 0 || (block[r / 3 * 3 + c / 3] & mask) > 0) {
                        return false;
                    }
                    row[r] |= mask;
                    col[c] |= mask;
                    block[r / 3 * 3 + c / 3] |= mask;
                } else if (num != '.') {
                    return false;
                }
            }
        }
        return true;
    }
}
