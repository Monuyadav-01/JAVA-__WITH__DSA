import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LTPR128 {
    public static int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // int cnt = 0;
        // int lSmall =Integer.MIN_VALUE;
        // int largest = 1;
        // if(nums.length==0){
        // return 0;
        // }

        // for (int i = 0; i < n; i++) {
        // if (nums[i] - 1 == lSmall) {
        // cnt=cnt+1;
        // lSmall=nums[i];
        // }
        // else if(nums[i]!=lSmall){
        // cnt=1;
        // lSmall=nums[i];
        // }
        // largest=Math.max(largest,cnt);
        // }
        // return largest;

        // using hashset

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longStreak=0;
        for(int num : nums){
            if(!set.contains(num-1)){
                int currStreak=1;
               int curNum=num;

               while(set.contains(curNum+1)){
                currStreak=currStreak+1;
                curNum=curNum+1;
               }
               longStreak=Math.max(longStreak,currStreak);
            }
        }
        return longStreak;
    }

    public static void main(String[] args) {
        int nums[] = {100,2,101,102, 1,3,4,5};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
}
