

import java.util.ArrayList;
import java.util.List;

/**
 * Triangle
 */
public class Triangle {
    private static int solveMemo(List<List<Integer>> triangle, int dp[][], int i, int j) {
        int n = triangle.size();
        if (i == n-1) {
            return triangle.get(i).get(j);
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down=triangle.get(i).get(j)+solveMemo(triangle, dp, i+1, j);
        int diagnol=triangle.get(i).get(j)+solveMemo(triangle, dp, i+1, j+1);

      return dp[i][j] =Math.min(down, diagnol);
    

    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
            

        int[][] dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        int ans = solveMemo(triangle, dp, 0,0);
        return ans;

    }

    public static void main(String[] args) {
       
        
    }
}