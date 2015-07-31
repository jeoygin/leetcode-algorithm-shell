import java.util.*;
public abstract class TestCase<T> {
	protected <T> int verifyCase(int casenum, T expected, T received) {
		System.err.print("Example " + casenum + "... ");
	    if (compare(expected, received)) {
	    	System.err.println("PASSED");
	    	return 1;
	    } else {
			System.err.println("FAILED");
			System.err.println("    Expected: " + formatResult(expected));
	        System.err.println("    Received: " + formatResult(received));
	        return 0;
	    }
	}
	
	protected boolean compare(Object expected, Object result) {
		if (expected instanceof List) {
			List expectedList = (List) expected;
			List resultList = (List) result;
			if (expectedList.size() != resultList.size()) {
				return false;
			}
			for (int i = 0; i < expectedList.size(); i++) {
				if (!compare(expectedList.get(i), resultList.get(i))) {
					return false;
				}
			}
			return true;
		} else if (expected instanceof int[][]) {
			return compareMatrix((int[][]) expected, (int[][]) result);
		} else if (expected instanceof int[]) {
			return compareArray((int[]) expected, (int[]) result);
		} else if (expected instanceof char[][]) {
			return compareMatrix((char[][]) expected, (char[][]) result);
		} else if (expected instanceof char[]) {
			return compareArray((char[]) expected, (char[]) result);
		}
		return expected == result || expected != null && expected.equals(result); 
	}

	protected boolean compareMatrix(int[][] srcMatrix, int[][] dstMatrix) {
		if (srcMatrix.length != dstMatrix.length) {
			return false;
		}
		for (int r = 0; r < srcMatrix.length; r++) {
			if (!compareArray(srcMatrix[r], dstMatrix[r])) {
				return false;
			}
		}
		return true;
	}

	protected boolean compareMatrix(char[][] srcMatrix, char[][] dstMatrix) {
		if (srcMatrix.length != dstMatrix.length) {
			return false;
		}
		for (int r = 0; r < srcMatrix.length; r++) {
			if (!compareArray(srcMatrix[r], dstMatrix[r])) {
				return false;
			}
		}
		return true;
	}

	protected boolean compareMatrix(Object[][] srcMatrix, Object[][] dstMatrix) {
		if (srcMatrix.length != dstMatrix.length) {
			return false;
		}
		for (int r = 0; r < srcMatrix.length; r++) {
			if (!compareArray(srcMatrix[r], dstMatrix[r])) {
				return false;
			}
		}
		return true;
	}

	protected boolean compareArray(int[] srcArr, int[] dstArr) {
		if (srcArr.length != dstArr.length) {
			return false;
		} 
		for (int i = 0; i < srcArr.length; i++) {
			if (srcArr[i] != dstArr[i]) {
				return false;
			}
		}
		return true;
	}

	protected boolean compareArray(char[] srcArr, char[] dstArr) {
		if (srcArr.length != dstArr.length) {
			return false;
		} 
		for (int i = 0; i < srcArr.length; i++) {
			if (srcArr[i] != dstArr[i]) {
				return false;
			}
		}
		return true;
	}

	protected boolean compareArray(Object[] srcArr, Object[] dstArr) {
		if (srcArr.length != dstArr.length) {
			return false;
		} 
		for (int i = 0; i < srcArr.length; i++) {
			if (!srcArr[i].equals(dstArr[i])) {
				return false;
			}
		}
		return true;
	}

	protected String formatResult(Object res) {
		if (res instanceof List) {
			List list = (List) res;
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i = 0; i < list.size(); i++) {
				if (i > 0) {
					sb.append(", ");
				}
				sb.append(formatResult(list.get(i)));
			}
			sb.append("]");
			return sb.toString();
		} else if (res instanceof int[][]) {
			return outputMatrix((int[][]) res);
		} else if (res instanceof int[]) {
			return outputArray((int[]) res);
		} else if (res instanceof char[][]) {
			return outputMatrix((char[][]) res);
		} else if (res instanceof char[]) {
			return outputArray((char[]) res);
		}
		return res != null ? res.toString() : "null";
	}

	protected String outputMatrix(int[][] matrix) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < matrix.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(outputArray(matrix[i]));
		}
		sb.append("]");
		return sb.toString();
	}

	protected String outputMatrix(char[][] matrix) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < matrix.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(outputArray(matrix[i]));
		}
		sb.append("]");
		return sb.toString();
	}

	protected String outputMatrix(Object[][] matrix) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < matrix.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(outputArray(matrix[i]));
		}
		sb.append("]");
		return sb.toString();
	}

	protected String outputArray(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(arr[i]);
		}
		sb.append("]");
		return sb.toString();
	}

	protected String outputArray(char[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(arr[i]);
		}
		sb.append("]");
		return sb.toString();
	}

	protected String outputArray(Object[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(arr[i]);
		}
		sb.append("]");
		return sb.toString();
	}
	
	public abstract int runTestCase(int casenum);
}