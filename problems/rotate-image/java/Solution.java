public class Solution {
    public void rotate(int[][] matrix) {
		int n = matrix.length;
        for (int l = (n >> 1) & ~1; l >= 0; l--) {
        	for (int i = n - l - 2; i >= l; i--) {
				int r = l, c = i;
        		int v = matrix[r][c];
				for (int cnt = 0; cnt < 3; cnt++) {
					int t = r;
					r = c;
					c = n - 1 - t;
					if (matrix[r][c] != v) {
						v ^= matrix[r][c];
						matrix[r][c] ^= v;
						v ^= matrix[r][c];
					}
				}
				matrix[l][i] = v;
        	}
        }
    }
}
