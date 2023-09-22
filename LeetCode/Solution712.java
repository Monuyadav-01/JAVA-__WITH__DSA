

public class Solution712 {

    
    public static  int minimumDeleteSum(String s1, String s2) {
        int n= s1.length();
        int m =s2.length();
        return recurive(s1, s2, n, m);
    }
    private static int recurive(String s1, String s2, int n, int m) {

        if(m == 0){
            int charsum  = get(s1,n);
            return charsum;
        }
        if(n == 0){
            int charsum  = get(s2, m);
            return charsum;
        }
        if(s1.charAt(n-1) == s2.charAt(m-1)){
            return recurive(s1, s2, n-1, m-1);
        }
        else{
            int ans1 = s1.charAt(n-1)+ recurive(s1, s2, n-1, m);
            int ans2 =  s2.charAt(m-1)+ recurive(s1, s2, n, m-1);
            return Math.min(ans1, ans2);
        }
    }
    private static int get(String s1, int n) {
        int sum =0;
        for(int i  =0; i< n;i++){
             sum = sum+s1.charAt(i);
        }
        return sum;
    }
    public static void main(String[] args) {
        String s1="sea";
        String s2="eat";
        System.out.println(minimumDeleteSum(s1, s2));
    }
}
