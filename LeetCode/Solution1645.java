public class Solution1645 {
    public  static int countVowelStrings(int n) {
        String [] s  = { "a", "e", "i", "o","u"};
        int idx = s.length;
        int dp[] [] =new int[idx][n+1];

        for(int i = 0; i<s.length ; i++){
            dp[i][0] =1;
        }
        for(int i= 0;i<s.length;i++){
            for(int j=0;j<n+1;j++){
                
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
