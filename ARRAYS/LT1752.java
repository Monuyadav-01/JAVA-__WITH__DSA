public class LT1752 {
     public static boolean check(int[] nums) {
     
       return helper(nums, 0);
       
    }
    public static boolean helper(int []nums , int s){
        if(nums[s]>nums[s+1] && nums[s]<nums[nums.length-1]){
            return false;
        }

      
      else if(nums[s]<nums[s+1] && nums[s]>nums.length-1){
        boolean ans=helper(nums, s++);
        return ans;
      }
      
   
      
     
    }
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2,7};
        boolean check=check(nums);
        System.out.println(check);

    }
}
