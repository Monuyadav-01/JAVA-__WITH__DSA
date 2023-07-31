public class LTP268 {
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int sum1 = n * (n + 1) / 2;

        for(int i=0; i<nums.length;i++){
            sum=sum+nums[i];
        }
        int ans=sum1-sum;
        return ans;

    }
    public static void main(String[] args) {
        int nums[]={3,0,1, };
        
        int ans=missingNumber(nums);
        System.out.print(ans);
        
        
    }
}
