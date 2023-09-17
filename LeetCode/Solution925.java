public class Solution925 {
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int idx=0;

        for(int i=0;i<nums.length; i++){
            if(nums[i] % 2 ==0){
                nums[idx++] = nums[i];
            }
        }
        for(int  i = idx ; i<n; i++){
            if(nums[i] % 2 == 1){
                nums[idx] = nums[i];
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = { 3, 1, 2, 4};
        int ans[] = sortArrayByParity(nums);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
