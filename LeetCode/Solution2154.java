import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Solution2154
 */
public class Solution2154 {
    // public static int findFinalValue(int[] nums, int original) {
    //     int i =0;
    //     Arrays.sort(nums);
    //     int n =nums.length;
    //     while(i<=n-1){
    //         if(nums[i] == original){
    //             original=2*original;
    //         }
    //         i++;
    //     }
    //     return original;
    // }
    public static int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(i>=original) set.add(i);
        }
       while(!set.isEmpty()){
        if(set.contains(original)){
            original=2*original;
        }
        else{
            break;
        }
       }
        return original;
    }

    public static void main(String[] args) {
        int nums[] = {5,3,6,1,12};
        System.out.println(findFinalValue(nums, 3));
    }
}