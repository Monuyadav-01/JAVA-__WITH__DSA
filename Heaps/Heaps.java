import java.util.PriorityQueue;

/**
 * Heaps
 */
public class Heaps {

    

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int arr[]= {1,3,0, 9, 5,2};
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        for(int i=0; i<arr.length;i++){
           int ans= pq.remove();
           System.out.println(ans);
        }
    }
}