import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution1338 {

    public static int minSetSize(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for (int count : mp.values()) {
            pq.offer(count);
        }
        int ele = 0;
        int setCount = 0;
        while (!pq.isEmpty()) {
            ele += pq.poll();
            setCount++;
            if (ele >= n / 2) {
                return setCount;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int nums[] = {3,3,3,3,5,5,5,2,2,7};
        System.out.println(minSetSize(nums));
    }
}
