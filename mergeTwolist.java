

public class mergeTwolist {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode a = null;
        ListNode b = null;
        ListNode c = null;
        ListNode d = null;
        int x;
        if(list1.val < list2.val){
            a = list1;
            c =list2;
            x=0;
        }else{
            a = list2;
            c = list1;
            x=1;
        }
        while(a!=null){
            if(a.val <= c.val){
                b=a;
                a= a.next;  
            }
            else{
                d=c;
                c= c.next;
                d.next=a;
                b.next=d;  
            }
        }
        if(c!=null){
            b.next = c;
        }
        if(x==0){
            return list1;
        }else{
            return list2;
        }
    }
}
