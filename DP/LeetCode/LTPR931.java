
import java.util.Arrays;

/**
 * LTPR931
 */
public class LTPR931 {

    public static int solverec(int i, int j, int[][] matrix, int dp[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (j < 0 || j >= m || i < 0 || i >=n) {
            return Integer.MAX_VALUE;
        }
        if (i == 0)
            return matrix[0][j];

        if (dp[i][j] != 0)
            return dp[i][j];
        int up = matrix[i][j] + solverec(i - 1, j, matrix,dp);
        int rightdiagonal = matrix[i][j] + solverec(i - 1, j + 1, matrix,dp);
        int leftdiagonal = matrix[i][j] + solverec(i - 1, j - 1, matrix,dp);

        return dp[i][j]  = Math.min(up, Math.min(rightdiagonal, leftdiagonal));
      
    }

    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m=matrix[0].length;
        int dp[][] = new int[n][m];
        int ans=Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            int mini = solverec(n - 1, j, matrix, dp);
           ans=Math.min(ans, mini);
        }
        return ans;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 2, 1, 3 }, { 6, 5, 7 }, { 7, 8, 9 } };

        System.out.println(minFallingPathSum(matrix));
    }
}