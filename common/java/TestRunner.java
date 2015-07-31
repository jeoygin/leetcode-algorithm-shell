public class TestRunner {
	public static void run(TestCase testcase, int casenum) {
		if (casenum != -1) {
			if (testcase.runTestCase(casenum) == -1) {
		    	System.err.println("Illegal input! Test case " + casenum + " does not exist.");
			}
			return;
		}
		
		int correct = 0, total = 0;
		for (int i=0;; ++i) {
			int x = testcase.runTestCase(i);
		    if (x == -1) {
		    	if (i >= 100)  {
		    		break;
		    	}
		        continue;
            }
            correct += x;
            ++total;
        }

        if (total == 0) {
                System.err.println("No test cases run.");
        } else if (correct < total) {
                System.err.println("Some cases FAILED (passed " + correct + " of " + total + ").");
        } else {
                System.err.println("All " + total + " tests passed!");
        }
	}
}