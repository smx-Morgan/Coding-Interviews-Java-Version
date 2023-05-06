import java.util.Stack;

public class Coding52 {
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }
}
// stack answer :
/*
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stack1 = new Stack<ListNode>();
        Stack<ListNode> stack2 = new Stack<ListNode>();
        if(headA == null || headB == null){
            return null;
        }
        stack1.push(headA);
        while(headA.next != null){
            headA = headA.next;
            stack1.push(headA);
        }
        stack2.push(headB);
        while(headB.next != null){
            headB = headB.next;
            stack2.push(headB);
        }
        ListNode ans = null;
        while(stack1.peek() == stack2.pop()){
            ans = stack1.pop();
            if(stack1.empty() || stack2.empty()){
                return ans;
            }
        }
        return ans;
    }
 */