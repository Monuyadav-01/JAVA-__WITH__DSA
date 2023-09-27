import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * LeetCodeSol658
 */
class pair{
    int f;
    int s;
    pair(int f, int s){
        this.f=f;
        this.s=s;
    }
}
public class LeetCodeSol658 {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair> pq= new PriorityQueue<>(Collections.reverseOrder());
        List<Integer>list= new ArrayList<>();
        for(int i =0; i<arr.length;i++){
            if(pq.size()>k){
                pq.poll();
            }
            pq.add(new pair(Math.abs(arr[i]-x), arr[i]));
        }
        while (!pq.isEmpty()) {
            list.add(pq.poll().s);
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k =4;
        int x=3;

        List<Integer> ans =findClosestElements(arr, k, x);
        for(int i : ans){
            System.out.println(i);
        }
    }
}
//    PriorityQueue<int[]> pq= new PriorityQueue<>(
//           (p1,p2)->getDistance(p1).compareTo(getDistance(p2))
//         );
//         for(int i =0;i<points.length;i++){
//           pq.add(points[i]);
//         }
//         int [][] res= new int[k][2];
//         for(int i=0;i<k;i++){
//           res[i]=pq.poll();
//         }
//         return res;
//     }
//     public Double getDistance(int [] point){
//       return Math.sqrt((point[0]*point[0])+(point[1]*point[1]));
//     }