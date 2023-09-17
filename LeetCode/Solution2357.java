import java.util.HashSet;

public class Solution2357 {
     public static int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
          set.add(i);
        }
        if(set.contains(0)){
          return set.size()-1;
        }
        else{
          return set.size();
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,5,0,3,5};
        System.out.println(minimumOperations(nums));
    }
}
