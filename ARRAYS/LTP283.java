import java.util.ArrayList;

/**
 * LTP283
 */
public class LTP283 {

    public static void moveZeroes(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr.add(nums[i]);
            }
        }
        int nz = arr.size();
        for (int i = nz; i < nums.length; i++) {
            arr.add(0);
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }

    public static void main(String[] args) {
        int nums[] = { 0, 1, 3, 0, 12 };

        moveZeroes(nums);

      

    }

}