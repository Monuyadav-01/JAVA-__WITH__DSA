import java.util.Scanner;

/**
 * BnaryTree
 */
public class BnaryTree {

    public static Node insert(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Take Data : ");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node root=new Node(data);

        Node left=insert();
        Node right=insert();

        root.left=left;
        root.right=right;

        return root;
        
    }

    public static void print(Node root){
        
        if(root==null){
            return ;
        }

        System.out.println(root.data);

        if(root.left!=null){
            System.out.print("L" + root.left.data);
        }
        else if(root.right!=null){
           System.out.println("R" + root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);

    }
    public static void main(String[] args) {
        Node root=insert();
        print(root);
    }

}