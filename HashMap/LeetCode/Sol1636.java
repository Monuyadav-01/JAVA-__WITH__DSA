package LeetCode;
import java.util.HashMap;

public class Sol1636 {
    public static int[] frequencySort(int[] nums) {

        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(i)){
                mp.put(nums[i], mp.get(i)+1);
            }
            else{
                mp.put(nums[i],1);
            }
        }
    
    }

    public static void main(String[] args) {

    }
}
