import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que2 {
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length-1;
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        while (i < n) {
            if(nums[i]==nums[i+1]){
                result.add(nums[i]);
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1};
        ArrayList<Integer> res=(ArrayList<Integer>) findDuplicates(nums);
        for(int i : res){
            System.out.print(i+ " ");
        }
    }
}
