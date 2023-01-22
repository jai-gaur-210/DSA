import java.util.List;

public class ReoderList {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
    public void reorderList(ListNode head) {
        int x=0;
        ListNode a =head;
        int k=0;
        while(a!=null){
            x++;
            a = a.next;
        }
        if(x%2==0){
            k = (x/2);
        }
        else{
            k =  (x/2)+1;
        }
        int j =k;
        ListNode d = head;
        while(j!=1){
            d=d.next;
            j--;
        }
        ListNode p =null;
        ListNode b=d.next;
        ListNode c= null;
        while(b != null){
            p = b;
            b = p.next;
            p.next = c;
            c = p;
        }
        d.next=null;
        ListNode r = head;
        ListNode t =head;
        while(c!=null){
            r.next = c;
            c = c.next;
            t = t.next;
            r.next =t;
        }
        
    }
}
