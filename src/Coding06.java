import java.util.Stack;

public class Coding06 {
    //从头到尾打印列表
    public Stack<Integer> stack = new Stack<>();
    public int[] reversePrint(ListNode head) {
        if(head != null){
            stack.push(head.val);
        }else{
            return new int[0];
        }
        if(head.next != null){
            dfs(head.next);
        }
        int[] ans = new int[stack.size()];
        int index = 0;
        while(!stack.empty()){
            int tmp = stack.pop();
            ans[index] = tmp;
            index++;
        }
        return ans;
    }
    public void dfs(ListNode node){
        stack.push(node.val);
        if(node.next != null){
            dfs(node.next);
        }else{
            return;
        }
    }
}
