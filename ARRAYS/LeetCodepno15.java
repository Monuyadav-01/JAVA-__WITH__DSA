import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class LeetCodepno15 {

    public static List<List<Integer>> threeSum(int[] nums) {
           Arrays.sort(nums) ;
           int n=nums.length;

        // Create 2D vector for storing answer.
        List< List < Integer > > ans = new ArrayList<>();

        // For loop from 0 to N-3.
        for(int idx = 0; idx < (n-2); idx++)
        {
            // if arr[idx] not equal to arr[idx-1].
            if(idx == 0 || (nums[idx] != nums[idx-1]))
            {
                // create left, right and sum.
                int left = idx+1, right = n-1, sum = -nums[idx] ;
                while(left < right)
                {
                    // if arr at left and right sums to sum.
                    if((nums[left] + nums[right]) == sum)
                    {
                        // Update ans.
                        ans.add(Arrays.asList(nums[idx], nums[left], nums[right])) ;
                        // skip the same elements.
                        while(left < right && nums[left] == nums[left+1])
                        {
                            left++ ;
                        }
                        while(left < right && nums[right] == nums[right-1])
                        {
                            right-- ;
                        }
                        // Increase left and decrease right.
                        left++ ;
                        right-- ;
                    }
                    // If arr at left and right sums less than sum.
                    else if((nums[left] + nums[right]) < sum)
                    {
                        // Increase left.
                        left++ ;
                    }
                    // Otherwise decrease right.
                    else
                    {
                        right-- ;
                    }
                }
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        
    }
}
