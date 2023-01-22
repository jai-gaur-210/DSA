import java.util.HashMap;

public class RemoveDuplicate {
    class Node
    {
        int data;
        Node next;
        Node(int d) {
            data = d; 
            next = null;
        }
    }
    public Node removeDuplicates(Node head) 
    {
        HashMap<Integer,Integer> h = new HashMap<>();

        Node a=null;
        Node b=head;

        while(b!=null){
            if(!h.containsKey(b.data)){
                h.put(b.data, 1);
                a=b;
                b = b.next;
            }
            else{
                b=b.next;
                a.next=b;
                a=b;
                b=b.next;
            }
            
        }
        return head;
    }
}
