class reverseList{
      public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode a=null;
        ListNode b=null;; 
        while(head != null){
            b = head;
            head = b.next;
            b.next =a;
            a = b;
        }
        return b;
    }

    public static void main(String[] args) {
        
    }
}