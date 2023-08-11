
import java.util.*;
public class LT122 {
    

    public static int getAns(int[] Arr, int ind, int buy, int n, List<List<Integer>> dp) {
        if (ind == n)
            return 0;
        if (dp.get(ind).get(buy) != -1)
            return dp.get(ind).get(buy);
        int profit=0;
        if (buy == 0) {
            profit = Math.max(0 + getAns(Arr, ind + 1, 0, n, dp), -Arr[ind] + getAns(Arr, ind + 1, 1, n, dp));
        }
        if (buy == 1) {
            profit = Math.max(0 + getAns(Arr, ind + 1, 1, n, dp), Arr[ind] + getAns(Arr, ind + 1, 0, n, dp));
        }
        dp.get(ind).set(buy, profit);
        return profit;
    }

    public static int getMaximumProfit(int[] prices) {
        int n=prices.length;
        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dp.add(new ArrayList<>(Arrays.asList(-1, -1)));
        }
        if (n == 0)
            return 0;
        int ans = getAns(prices, 0, 0, n, dp);
        return ans;
    }

    public static void main(String[] args) {
        // Test your code here
        int arr[]={7,1,5, 3, 6, 4};
        

        System.out.println(getMaximumProfit(arr));
    }
}

