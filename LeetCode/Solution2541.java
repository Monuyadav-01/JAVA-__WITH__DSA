import java.util.Arrays;

public class Solution2541 {

    public static long minOperations(int[] nums1, int[] nums2, int k) {
        if (k == 0) {
            return Arrays.equals(nums1, nums2) ? 0 : -1;
        }
        if (Arrays.equals(nums1, nums2)) {
            return 0;
        }

        if (nums1.length != nums2.length)
            return -1;
        long forNagative = 0;
        long forPositive = 0;
        for (int i = 0; i < nums1.length; i++) {
            int differance = nums1[i] - nums2[i];

            if (differance % k != 0) {
                return -1;
            }
            
            if(differance<0){
                forNagative +=-differance/k;
            }
            else{
                forPositive+=differance/k;
            }
        }
      return  forPositive == forNagative ? forPositive : -1;

    }

    public static void main(String[] args) {
        int [] nums1= {4,3,1,4};
        int nums2 [] ={1,3,7,1};

        int k =3;
        System.out.println(minOperations(nums1, nums2, k));

    }
}
