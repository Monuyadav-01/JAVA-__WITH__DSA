package LinkList;


public class LinkList1 {
    public static void main(String[] args) {
        Node node1=new Node(10);
        Node node2=new Node(20);
        Node node3=new Node(30);
        Node node4=new Node(40);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;


        Node head=node1;

        while(head!=null){
            System.out.print(head.data+">" );
            head=head.next;
        }
      

    }
}
