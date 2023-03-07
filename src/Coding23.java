public class Coding23 {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        int len = 0;
        ListNode node = hasCycle(head);
        if(node != null){
            len = LenCycle(node);
            node = head;
            for(int i = 0; i < len; i++){
                head = head.next;
            }
            while(node != head){
                node = node.next;
                head = head.next;
            }
            return node;
        }
        return null;
    }
    public ListNode hasCycle(ListNode head) {
        ListNode fast  = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return fast;
            }
        }
        return null;
    }
    public int LenCycle(ListNode head){
        int len = 1;
        ListNode node = head.next;
        while(node != head){
            len++;
            node = node.next;
        }
        return len;
    }
}
