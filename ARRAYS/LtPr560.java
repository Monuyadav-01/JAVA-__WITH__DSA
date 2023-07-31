
public class LtPr560 {
 public static long solve(int N, int[] A) {
        // code here
  int ans=0;
for(int i=0; i<N; i++) { // for all i
  int sum=0;
  int j=i;
  while(j<N && sum+A[j]<B) // find the longest subarray
    sum+=A[j++];
 ans+=(j-i); 
}
        
    }
    
    public static void main(String[] args) {
        int nums[]={18, 6, 24, 1};
        long ans=solve(nums.length-1, nums);
        System.out.println(ans);
    }
}
