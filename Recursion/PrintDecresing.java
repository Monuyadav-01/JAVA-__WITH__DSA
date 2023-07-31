import java.util.Scanner;

public class PrintDecresing {
    public static void decrease(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        decrease(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        decrease(n);
    }
}
