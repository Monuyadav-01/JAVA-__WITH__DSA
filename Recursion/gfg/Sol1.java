package gfg;

/**
 * Sol1
 */
public class Sol1 {

  static  long mod = 1000000007;

    static long power(int N, int R) {
        // Your code here
        if (N == 1) {
            return 1;
        }
        if (R == 0) {
            return 1;
        }

        long pow = power(N, R - 1);
        long ans = N * pow;

        return ans % mod;

    }
    public static void main(String[] args) {
        int N=12;
        int R=21;

        System.out.println(power(N, R));
        
    }

}