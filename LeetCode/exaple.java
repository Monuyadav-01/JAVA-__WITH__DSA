import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * exaple
 */
public class exaple {

    public static void main(String[] args) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int nums[]= {1,1,1,2,2,3};
        int k =2;
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
          PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i : map.keySet()){
          heap.add(i);

          if(heap.size()>k) heap.poll();
        }
        while(!heap.isEmpty()){
            System.out.println(heap.peek());
            heap.poll();
        }
    }
}