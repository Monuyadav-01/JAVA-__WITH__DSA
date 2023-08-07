/**
 * ClimbingStairs
 */
public class ClimbingStairs {

    public static int helper(int n, int ans[]){
        if(n==0 || n==1){
            return 1;
        }
        if(ans[n]!=-1){
            return ans[n];
        }
        int a=helper(n-1, ans);
        int b=helper(n-2, ans);
        return a+b;
    }
    public static int ClimbingStair(int n){
        // if(n==0 || n==1){
        //     return 1;
        // }
        // int a=ClimbingStair(n-1);
        // int b=ClimbingStair(n-2);
        // return a+b;

        // DP problem using Memoization

        int ans[]=new int [n+1];
        
        for(int i=0;i<=n;i++){
            ans[i]=-1;
        }
        return helper(n, ans);
    }


    public static void main(String[] args) {
        int n=46;
        System.out.println(ClimbingStair(n));
    }

}