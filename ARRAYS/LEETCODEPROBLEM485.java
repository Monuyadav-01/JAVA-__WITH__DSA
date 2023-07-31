public class LEETCODEPROBLEM485 {
    public static int maxConsicutive(int nums[] ){
        int cnt=0;
        int maxi=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
                if(cnt>maxi){
                    maxi=cnt;
                }
            }
            else{
                cnt=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int nums[]={1,1,0,1,1,1,0,1,1};
        int ans=maxConsicutive(nums);
        System.out.println(ans);
    }
}
