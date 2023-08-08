import java.util.Arrays;

public class LT115 {
   static  int prime = (int)(Math.pow(10,9)+7);
  public static int memo(int i, int j, String s, String t, int dp[][]){

    if(j<0) {return 1;}

    if(i<0){ return 0;}


    

    if(dp[i][j]!=-1) return dp[i][j];

    if(s.charAt(i)==t.charAt(j)){
      int taken=memo(i-1, j-1, s, t, dp);
      int notTaken=memo(i-1, j, s, t, dp);
      return dp[i][j]=(taken+notTaken)%prime;
    }
    else{
      return dp[i][j]=memo(i-1, j, s,t,dp);
    }
  }
    public  static int  numDistinct(String s, String t) {
        int i=s.length();
        int j=t.length();
        int dp[][]=new int [i][j];
        for(int row [] : dp){
          Arrays.fill(row, -1);
        }
        return memo(i-1, j-1, s, t, dp);
    }
    public static void main(String[] args) {
        String s="rabbbit";
        String t="rabbit";
        System.out.println(numDistinct(s, t));
    }
}
