import java.util.Stack;

public class Coding09 {
}
//用两个栈实现一个队列。
class CQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        int ans = 0;
        if(stack2.empty()){
            while(!stack1.empty()){
                int tmp = stack1.pop();
                stack2.push(tmp);
            }
            if(stack2.empty()){return -1;}
            ans = stack2.pop();
        }else{
            ans = stack2.pop();
        }
        return ans;
    }
}