import java.util.Arrays;

/**
 * Solution324
 */
public class Solution324 {

    public static void wiggleSort2(int[] nums){
        Arrays.sort(nums);
        int ans[] =new int[nums.length];

       int n =nums.length;
       int  i=1; 
       int j= n-1;

       while(i<n){
        ans[i]= nums[j];
        i=i+2;
        j--;
       }
       i=0;
       while(i<n){
        ans[i] = nums[j];
        i=i+2;
        j--;
       }
       for(int k=0; k<n; k++){
        nums[k]= ans[k];
       }

       for(int k=0;k<n ;k++){
        System.out.print(nums[k] + " ");
       }
    }

    public static void main(String[] args) {
        int nums[] = {1,4,1,1,6,5};
        wiggleSort2(nums);
    }
}