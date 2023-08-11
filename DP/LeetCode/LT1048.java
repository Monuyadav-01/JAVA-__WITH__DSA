import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * LT1048
 */
public class LT1048 {

    public boolean compare(String s1, String s2) {
        if (s1.length() != s2.length() + 1)
            return false;
        int first = 0;
        int second = 0;
        while (first < s1.length()) {
            if (second < s2.length() && s1.charAt(first) == s2.charAt(second)) {
                first++;
                second++;
            } else {
                first++;
            }
        }
        return first == s1.length() && second == s2.length();
    }

    public static boolean comp(String s1, String s2) {
        return s1.length() < s2.length();
    }

    public int longestStrChain(List<String> words) {
        int n = words.size();

     
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxi = 1;
        for (int i = 0; i <= n - 1; i++) {
            for (int prev_index = 0; prev_index <= i - 1; prev_index++) {
                if (compare(words.get(i), words.get(prev_index)) && 1 + dp[prev_index] > dp[i]) {
                    dp[i] = 1 + dp[prev_index];
                }
            }
            if (dp[i] > maxi) {
                maxi = dp[i];
            }
        }
        return maxi;
    }

    public static void main(String[] args) {

    }
}