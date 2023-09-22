import java.util.Arrays;

public class SolutionDp1387 {

     public static int getKth(int lo, int hi, int k) {
        int ans [] =new int [hi-lo+1];
       int index =0;
        for(int i = lo ; i<=hi ;i++){
          ans[index] = i;
          index++;
        }
        int res[] = new int [ans.length];

        for(int i =0; i< res.length; i++){
          res[i] = helper(ans[i]);
        }
        Arrays.sort(res);
        return res[k-1];
    }
   static int helper(int num){
      if(num == 1) return 0;
      int steps =0; 
      if(num % 2 == 0){
        steps = 1+helper(num/2);
      }
      else{
        steps =1+helper(3*num+1);
      }
      return steps;
    }
    public static void main(String[] args) {
        int low= 7;
        int high =11;
        int k =4;
        System.out.println(getKth(low, high, k));
    }
}
