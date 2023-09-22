import java.util.ArrayList;
import java.util.Collections;

public class Solution2040 {

     public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
         int n = nums1.length;
         int m = nums2.length;
         ArrayList<Long> arr = new ArrayList<>();

         for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 arr.add((long) (nums1[i] * nums2[j]));
             }
         }
         Collections.sort(arr);
         return arr.get((int) (k - 1));
    }
    public static void main(String[] args) {
        int nums1[] = {-100000,100000};
        int nums2[] ={-100000,100000};
        long k =1;
        System.out.println(kthSmallestProduct(nums1, nums2, k));
    }
}
