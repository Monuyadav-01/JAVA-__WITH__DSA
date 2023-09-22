package HashMap;
import java.util.HashMap;
import java.util.*;
public class Solution1 {
    public static void main(String[] args) {
        int nums[] = {1,3,2,6};
        HashMap<Integer, Integer> map =new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
       for(int i : nums){
        System.out.println(map.get(i));
       }
    }
}
