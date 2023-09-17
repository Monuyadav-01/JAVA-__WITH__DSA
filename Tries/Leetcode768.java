/**
 * Leetcode768
 */
public class Leetcode768 {
    public static int maxChunksToSorted(int[] arr) {
        int ans = 0;
        int n = arr.length;
        int[] lMax = new int[n];
        int rmin[] = new int[n];
        
        lMax[0]= arr[0];
        for(int i=1; i<n; i++){
            lMax[i] =Math.max(arr[i], lMax[i-1]);
        }
        rmin[n-1]= arr[n-1];
        for(int i = n-2 ; i>=0; i--){
            rmin[i] = Math.min(arr[i], rmin[i+1]);
        }
        for(int i=1; i<n ;i++){
            if(lMax[i-1]<=rmin[i]){
                ans++;
            }
        }
        return ans+1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 4, 4 };
        System.out.println(maxChunksToSorted(arr));
    }
}