/**
 * LTPROBLEM189
 */
public class LTPROBLEM189 {
    // for only one place
    // public static void pr(int arr[], int n){
    // int temp=arr[0];
    // for(int i=1;i<n;i++){
    // arr[i-1]=arr[i];
    // }
    // arr[n-1]=temp;
    // }

    // rotate k place

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        for (int i = k; i < n; i++) {
            nums[i-k]=nums[i];
        }
        for(int i=n-k; i<n;i++){
            nums[i]=temp[i-(n-k)];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        rotate(arr, 3);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}