
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution2790 {
    public static int maxIncreasingGroups(List<Integer> usageLimits) {
       int n =usageLimits.size();
       int sum =0;
       int k =0;
       for(int i=0;i<n;i++){
        sum = sum+usageLimits.get(i);
        if(sum>=(k+1)*(k+2)/2){
            k++;
        }
       }
       return k;

    }

    public static void main(String[] args) {
        List<Integer> use = new ArrayList<>();
        use.add(1);
        use.add(2);
        use.add(5);
        System.out.println(maxIncreasingGroups(use));
    }
}
