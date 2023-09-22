import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Solution2231
 */
public class Solution2231 {
  public static int largestInteger(int num) {
        // PriorityQueue<Integer> even  = new PriorityQueue<>();
        // PriorityQueue<Integer> odd  = new PriorityQueue<>();
        // String s =Integer.toString(num);
        // for(char x : s.toCharArray()){
        //    int temp = x -'0';
        //     if(temp %2 ==0 ){
        //         even.add(temp);
        //     }
        //     else{
        //         odd.add(temp);
        //     }
        // }
        // char ch [] = s.toCharArray();

        // for(int i =0 ; i<ch.length;i++){
        //     int temp = ch[i] -'0';
        //     if(temp%2 == 0){
        //         ch[i] = (char) (even.poll() + '0');

        //     }
        //     else{
        //         ch[i] = (char) (odd.poll() + '0');
        //     }
        // }
        // return Integer.parseInt(new String(ch));
        String s = Integer.toString(num);
        PriorityQueue<Integer> odd = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> even = new PriorityQueue<>(Collections.reverseOrder());
        for (char x : s.toCharArray()) {
            int tmp = x - '0';
            if (tmp % 2 == 0) {
                even.add(tmp);
            } else {
                odd.add(tmp);
            }
        }

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i] - '0';
            if (tmp % 2 == 0) {
                arr[i] = (char) (even.poll() + '0');
            } else {
                arr[i] = (char) (odd.poll() + '0');
            }
        }

        return Integer.parseInt(new String(arr));

    }
    public static void main(String[] args) {
        int num =1234;

        System.out.println(largestInteger(num));
    }
}