package Leetcode.PROBLEM2040;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
     public static long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int n=nums1.length;
        int m=nums2.length;
        ArrayList<Integer> arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
              arr.add(nums1[i]*nums2[j]);
            }
        }
        Collections.sort(arr);
        return arr.get((int) (k-1));
    }
}
