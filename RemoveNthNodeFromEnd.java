public class RemoveNthNodeFromEnd {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode a=head;
        ListNode b=head;
        
        while(b!=null){
            if(n>=0){
                b=b.next;
                n--;
                if(n==1 && b.next==null){
                    return head.next;
                }
            }
            else{
                a=a.next;
                b=b.next;
            }
        }
        a.next = a.next.next;
        return head;
    }
}
