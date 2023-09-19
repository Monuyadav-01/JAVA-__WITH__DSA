import java.util.Arrays;
import java.util.HashMap;

public class Solution2007 {
    public static int[] ans(int[] a) {
        int n = a.length;
        int index = 0;
        if (n % 2 != 0)
            return new int[0];
        Arrays.sort(a);
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] =new int[n/2];
        for(int i=0;i<n;i++){
            map.put(a[i], map.getOrDefault(a[i],0)+1);
        }
        for(int  i : a){
            if(map.get(i)<=0) continue;
            if(index == a.length) break;

            map.put(i,map.get(i)-1);
            int find= i*2;

            if(map.containsKey(find) && map.get(find) > 0 ){
                ans[index++] =i;

                map.put(find, map.get(find)-1);
            }
            else{
                return new int[0];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {2,1,6,8,3};
        int king[] = ans(nums);
        for(int i : king){
            System.out.println(i);
        } 
    }
}
