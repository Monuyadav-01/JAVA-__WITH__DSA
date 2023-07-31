package LinkList;

import java.util.Scanner;

/**
 * LinkList
 */
public class LinkList {
    public static Node takeInput(){
        Node head=null;
        Node tail=null;
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        while(data!=-1){
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            // insert at head linked data.

            // else{
            //     newnode.next=head;
            //     head=newnode;
            // }

           // insert at tail
            else{
                tail.next=newnode;
                tail=newnode;
            }
            data=sc.nextInt();
        }
        return head;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static Node inset(Node head, int pos ,int data){
        Node newnode=new Node(data);
        if(pos==0){
            newnode.next=head;
            return newnode;
        }
        int count=0;
        Node temp=head;
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }

    public static void main(String[] args) {
        Node head=takeInput();
      head=  inset(head, 0, 10);
        print(head);
    }
}