import java.util.*;
public class Solution {
	int n = 9;
	int[] row = new int[n], col = new int[n], block = new int[n];
    public void solveSudoku(char[][] board) {
        List<Integer> cells = new ArrayList<Integer>();
        for (int r = 0; r < n; r++) {
        	for (int c = 0; c < n; c++) {
        		if (board[r][c] >= '1' && board[r][c] <= '9') {
        			mask(r, c, board[r][c] - '0');
        		} else {
        			cells.add(r * n + c);
        		}
        	}
        }
       	search(board, cells, 0);
    }
    boolean search(char[][] board, List<Integer> cells, int i) {
    	if (i == cells.size()) {
    		return true;
    	}
    	int r = cells.get(i) / n, c = cells.get(i) % n;
    	for (int num = 1; num <= 9; num++) {
    		int mask = 1 << num;
    		if ((row[r] & mask) == 0 && (col[c] & mask) == 0 && (block[r/3*3+c/3] & mask) == 0) {
    			board[r][c] = (char)('0' + num);
    			mask(r, c, num);
    			if (search(board, cells, i + 1)) {
    				return true;
    			}
    			unmask(r, c, num);
    			board[r][c] = '.';
    		}
    	}
    	return false;
    }
    void mask(int r, int c, int num) {
    	row[r] |= 1 << num;
        col[c] |= 1 << num;
        block[r/3*3+c/3] |= 1 << num;
    }
    void unmask(int r, int c, int num) {
    	row[r] ^= 1 << num;
        col[c] ^= 1 << num;
        block[r/3*3+c/3] ^= 1 << num;
    }
}
