public class ZeroOneTwo {

    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    public Node segregate(Node head)
    {
        int x=0;
        int y=0;
        int z=0;
        Node a = head;
        Node b = head;
        while(head!=null){
            if(head.data==0){
                x++;
                head = head.next;
            }
            else if(head.data==1){
                y++;
                head = head.next;
            }
            else{
                z++;
                head = head.next;
            }
        }

        while(x>=0){
            a.data =0;
            a=a.next;
        }
        while(y>=0){
            a.data =1;
            a=a.next;
        }
        while(z>=0){
            a.data =2;
            a=a.next;
        }
        return b;
    }
}
