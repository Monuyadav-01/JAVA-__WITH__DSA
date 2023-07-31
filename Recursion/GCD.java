public class GCD {

    public static int gcd(int x, int y){
        // while (x%y!=0) {
        //   int  rem=x%y;
        //     x=y;
        //     y=rem;
        // }
        // return y;

        if(y==0) return x;
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        int gcd=gcd(12, 16);
        System.out.println(gcd);
    }
}
