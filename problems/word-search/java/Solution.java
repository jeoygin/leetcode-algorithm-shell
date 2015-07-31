public class Solution {
    int[] dr = {0, -1, 1, 0}, dc = {-1, 0, 0, 1};
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        boolean[][] vis = new boolean[n][m];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (board[r][c] == word.charAt(0)) {
                    if (search(board, vis, word, r, c, 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    boolean search(char[][] board, boolean[][] vis, String word, int r, int c, int dep) {
        int n = board.length, m = board[0].length;
        if (dep == word.length()) {
            return true;
        }
        vis[r][c] = true;
        for (int d = 0; d < 4; d++) {
            int nextR = r + dr[d], nextC = c + dc[d];
            if (nextR >= 0 && nextR < n && nextC >= 0 && nextC < m && !vis[nextR][nextC] && board[nextR][nextC] == word.charAt(dep)) {
                if (search(board, vis, word, nextR, nextC, dep + 1)) {
                    return true;
                }
            }
        }
        vis[r][c] = false;
        return false;
    }
}
