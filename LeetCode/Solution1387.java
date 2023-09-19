import java.util.PriorityQueue;


public class Solution1387 {

   
    public static int[] kWeakestRows(int[][] mat, int k) {
      
        // making a priority queue to order input in the desired manner - first on
        // soldier count and then on index
        PriorityQueue<Integer[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            else
                return a[0] - b[0];
        });

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1)
                    count++;
                else
                    break; // if one civilian found then all next will be civilian
            }
            pq.add(new Integer[] { count, i }); // adding count and index to pq
            count = 0;
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = pq.poll()[1]; // just get the best k that fits our requirements

        return result;
    }

    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 0 },
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 0, 0 },
                { 1, 1, 1, 1, 1 } };
        int nums[] = kWeakestRows(mat, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
