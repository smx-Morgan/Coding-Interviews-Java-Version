import java.util.Stack;

public class Coding30 {
    class MinStack {

        Stack<Integer> A, B;
        /** initialize your data structure here. */
        public MinStack() {
            A = new Stack<>();//data
            B = new Stack<>();//min
        }

        public void push(int x) {
            A.push(x);
            if(B.isEmpty() || B.peek() >= x){
                B.add(x);
            }
        }

        public void pop() {
            if(A.pop().equals(B.peek()))
                B.pop();
        }

        public int top() {
            return A.peek();
        }

        public int min() {
            return B.peek();
        }
    }
}
