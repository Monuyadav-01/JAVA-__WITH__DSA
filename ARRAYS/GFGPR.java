
import java.util.HashMap;

public class GFGPR {

    public static int lenOfLongSubarr(int A[], int N, int K) {
        // int maxLen = 0;
        // int sum = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < N; i++) {

        // sum = sum + A[i];

        // if (sum == K) {
        // maxLen = Math.max(maxLen, i + 1);
        // }
        // int rem = sum - K;
        // if (map.containsKey(rem)) {
        // int len = i - map.get(rem);
        // maxLen = Math.max(maxLen, len);
        // }
        // if (!map.containsKey(sum)) {
        // map.put(sum, i);
        // }

        // }
        // return maxLen;
          HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int maxLen=0;
        
        for(int i=0; i<N;i++){
            sum=sum+A[i];
            if(sum==K) maxLen=Math.max(maxLen, i+1);
            int rem=sum-K;
            
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;


    }
        public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
          HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int maxLen=0;
        int N=a.length;
        
        for(int i=0; i<N;i++){
            sum=sum+a[i];
            if(sum==k) maxLen=Math.max(maxLen, i+1);
              int rem= (int) (sum-k);
            
            if(map.containsKey(rem)){
                int len=i-map.get(rem);
                maxLen=Math.max(maxLen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 1, 1, 1, 2, 4, 3 };

        int ans = lenOfLongSubarr(A, A.length - 1, 3);
        int ans2=longestSubarrayWithSumK(A, 3);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
