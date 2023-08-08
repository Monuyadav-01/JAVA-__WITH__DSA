

public class LT72 {
    
    public static int rec(int i, int j, String word1, String word2) {
        if (i < 0)
            return j + 1;
        if (j < 0)
            return i + 1;
            if(word1.charAt(i)==word2.charAt(j)){
                return 0+rec(i-1, j-1, word1, word2);
            }
            else{
                return 1+Math.min(rec(i-1, j, word1, word2), Math.min(rec(i, j-1, word1, word2), rec(i-1, j-1, word1, word2)));
            }

    }



    public static int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = 0 + dp[i - 1][j - 1];

                else
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
            }
        }

        return dp[n][m];

    }
    public static void main(String[] args) {
        String word1= "intention";
        String word2= "execution";
        System.out.println(minDistance(word1, word2));
    }
}
