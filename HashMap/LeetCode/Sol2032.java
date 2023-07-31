package LeetCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sol2032 {
        public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans=new ArrayList<>();
              HashSet<Integer> set1 = new HashSet<>();
              HashSet<Integer> set2 = new HashSet<>();

        for(int i : nums1){
            set1.add(i);
        }
        for(int j: nums2){
            if(set1.contains(j) && ans.contains(j)==false) ans.add(j);
            else set2.add(j); 
        }
        for(int num : nums3){
            if(set1.contains(num) && ans.contains(num)==false){
                ans.add(num);
            }
            if(set2.contains(num) && ans.contains(num)==false){
                ans.add(num);
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int []nums1={1,1,3,2};
        int nums2[]={3,2};
        int nums3[]={3};
        List<Integer>ans= twoOutOfThree(nums1, nums2, nums3);
        for(int num : ans){
            System.out.print(num+ ",");
        }

    }
}
