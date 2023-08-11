/**
 * LT1771
 */

public class LT1771 {


    static int lcs(String s1, String s2) {
    
    int n=s1.length();
    int m=s2.length();

    int dp[][]=new int[n+1][m+1];
    for(int i=0;i<=n;i++){
        dp[i][0] = 0;
    }
    for(int i=0;i<=m;i++){
        dp[0][i] = 0;
    }
    
    for(int ind1=1;ind1<=n;ind1++){
        for(int ind2=1;ind2<=m;ind2++){
            if(s1.charAt(ind1-1)==s2.charAt(ind2-1))
                dp[ind1][ind2] = 1 + dp[ind1-1][ind2-1];
            else
                dp[ind1][ind2] = 0 + Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);
        }
    }
    
    return dp[n][m];
    }

    static int palindromic(String s){
    
        String t = s;
        String ss = new StringBuilder(s).reverse().toString();
        return lcs(ss, t);
    
    }
    public static int longestPalindrome(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        String s = "";
        for (int i = 0; i < n || i < m; i++) {
               if (i < word1.length()) 
            s+= word1.charAt(i);
  
        // Then choose the ith character of the 
        // second string if it exists 
        if (i < word2.length()) 
            s += word2.charAt(i);
    }
    
    return palindromic(s);
    
        }

        public static void main(String[] args) {
            String word1="aa";
            String word2="bb";

            System.out.println(longestPalindrome(word1, word2));

        }

    }

