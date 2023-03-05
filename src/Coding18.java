public class Coding18 {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val){
            head = head.next;
            return head;
        }
        ListNode node = head;
        ListNode tmp;
        while(node.val != val || node.next == null){
            tmp = node.next;
            if(tmp.val == val){
                if(tmp.next != null){
                    node.next = tmp.next;
                    break;
                }else{
                    node.next = null;
                    break;
                }
            }
            node = node.next;
        }
        return head;
    }
}
