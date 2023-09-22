
import java.util.*;
public class Solution2099 {

    public static int[] maxSubsequence(int[] nums, int k) {
        int arr[] = new int[k];
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0 ;i<nums.length;i++){
            pq.add(nums[i]);
        }
        for(int  i =0 ; i<k ; i++){
            arr[i] = pq.peek();
            pq.poll();
        }
        return arr;
    }

    public static void main(String[] args) {
        int nums[] = {2,1,3,3};
         int ans []  =maxSubsequence(nums, 2);
         for(int i= 0;i<ans.length;i++){
            System.out.println(ans[i]);
         }
    }
}
