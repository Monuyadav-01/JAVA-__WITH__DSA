import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution3 {

    

    public static int minMoves2(int[] nums) {
        int n = nums.length;
        // Sort the array
        Arrays.sort(nums);

        // Find the median
        int median = n % 2 == 0 ? (nums[n / 2] + nums[n / 2 - 1]) / 2 : nums[n / 2];
        int steps = 0;

        // Calculate steps
        for (int num : nums) {
            steps += Math.abs(num - median);
        }

        return steps;
    } 
    //  public static int minimumSeconds(List<Integer> nums) {
    //      int n = nums.size();
    //     //Sort the array
    //     Collections.sort(nums);
        
    //     //Find the median
    //     int median = n%2==0 ? (nums.get(n/2)+nums.get(n/2-1))/2 : nums.get(n/2);
    //     int steps = 0;
        
    //     //Calculate steps
    //     for(int num : nums) {
    //         steps += Math.abs(num-median);
    //     }
        
    //     return steps;
    // }
    public static void main(String[] args) {
        int nums[]={1,2,1,2};
        System.out.println(minMoves2(nums));
    }
}
