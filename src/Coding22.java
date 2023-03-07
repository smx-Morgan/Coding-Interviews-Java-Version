public class Coding22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int cout = k;
        ListNode node;
        node = head;
        for(int i = 1; i < k; i++){
            if(head.next == null){
                return null;
            }
            head = head.next;
        }
        while(head.next != null){
            head= head.next;
            node = node.next;
        }
        return node;

    }
}
