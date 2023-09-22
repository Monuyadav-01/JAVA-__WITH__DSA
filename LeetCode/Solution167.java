public class Solution167 {

    // public static int[] twoSum(int[] numbers, int target) {
    //     int n = numbers.length;
    //     int ans [] =new int[2];
    //     for (int i = 0; i < n; i++) {
    //         for (int j =i+1; j < n; j++) {
    //             if (numbers[i] + numbers[j] == target) {
    //                 ans[0] = i+1;
    //                 ans[1] = j+1;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        
       
       int ans[] = new int[2];
       if(n == 0 || n<2) return ans;
       int left = 0;
       int right =n-1;


       while(left < right){
        int v =numbers[left] + numbers[right];
        if(v == target) {
            ans[0] =left+1;
            ans[1] = right+1;
            break;
        }
        if(v>target){
            right--;
        }
        else {
            left++;
        }
       }
       return ans;
    }


    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target = 9;
        int ans[] = twoSum(numbers, target);

        for(int x : ans){
            System.out.println(x);
        }
    }
}
