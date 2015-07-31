import java.util.*;
public class Solution {
    int row, col;
    int[] dr = {0, -1, 1, 0}, dc = {-1, 0, 0, 1};
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        row = board.length;
        col = board[0].length;
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for (int r = 0; r < row; r++) {
            queue.offer(r * col);
            queue.offer(r * col + col - 1);
        }
        for (int c = 0; c < col; c++) {
            queue.offer(c);
            queue.offer((row - 1) * col + c);
        }
        while (!queue.isEmpty()) {
            int idx = queue.poll();
            int r = idx / col, c = idx % col;
            if (board[r][c] != 'O') {
                continue;
            }
            board[r][c] = 'Y';
            for (int d = 0; d < 4; d++) {
                int newR = r + dr[d], newC = c + dc[d];
                if (newR >= 0 && newR < row && newC >= 0 && newC < col && board[newR][newC] == 'O') {
                    queue.offer(newR * col + newC);
                }
            }
        }
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (board[r][c] == 'O') {
                    board[r][c] = 'X';
                } else if (board[r][c] == 'Y') {
                    board[r][c] = 'O';
                }
            }
        }
    }
}
