public class SumArray {

    public static int sum(int nums[], int i){
        int sum=0;
        if(i>=nums.length){
            return sum  ;
        }
            sum=nums[i];
            sum=sum+sum(nums,i+1);
            
        return sum;
    }
    public static void main(String[] args) {
        int[] nums={2,1,2};

        int sum=sum(nums, 0);
        System.out.println(sum);

    }
}
