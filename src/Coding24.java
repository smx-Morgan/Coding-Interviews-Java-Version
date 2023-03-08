public class Coding24 {
    //反转链表
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode node;
        ListNode fron;
        if(head.next == null){
            return head;
        }
        fron = head;
        head = head.next;
        fron.next = null;
        while(head.next != null){
            node = head;
            head = head.next;
            node.next = fron;
            fron = node;
        }
        head.next = fron;
        return head;
    }
}
