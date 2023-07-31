public class DLL {
   static Node head;
    public static void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    public static void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.data+ "->");
            node=node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DLL.insertFirst(1);
        DLL.insertFirst(2);
        DLL.insertFirst(3);
        DLL.insertFirst(3);

        DLL.display();



        
    }
}
