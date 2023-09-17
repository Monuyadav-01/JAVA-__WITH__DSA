import java.util.Arrays;

/**
 * Solution628
 */
public class Solution628 {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans  = nums[n-1]*nums[n-2]*nums[n-3];
        int startAns = nums[n-1] * nums[0]  * nums[1];
        return Math.max(ans, startAns);
    }
    public static void main(String[] args) {
        int arr [] = {-6, -6, 8, 4, 2, 1};
        System.out.println(maximumProduct(arr));
    }
}