// class MinStack {
//     public void push(int x) {
//         
//     }
// 
//     public void pop() {
//         
//     }
// 
//     public int top() {
//         
//     }
// 
//     public int getMin() {
//         
//     }
// }

import java.util.*;
public class Test extends TestCase<List<Integer>>{
    public int runTestCase(int casenum) {
        switch(casenum) {
            case 0: {
                MinStack stack = new MinStack();
                List<Integer> list = new ArrayList<Integer>();
                stack.push(2);
                stack.push(3);
                stack.push(1);
                list.add(stack.getMin());
                stack.pop();
                list.add(stack.getMin());
                stack.pop();
                list.add(stack.getMin());                

                return verifyCase(casenum, Arrays.asList(1, 2, 2), list);
            }
            case 1: {
                MinStack stack = new MinStack();
                List<Integer> list = new ArrayList<Integer>();
                stack.push(2);
                stack.push(0);
                stack.push(3);
                stack.push(0);
                list.add(stack.getMin());
                stack.pop();
                list.add(stack.getMin());
                stack.pop();
                list.add(stack.getMin());
                stack.pop();
                list.add(stack.getMin());

                return verifyCase(casenum, Arrays.asList(0, 0, 0, 2), list);
            }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        TestRunner.run(new Test(), -1);
    }
}
