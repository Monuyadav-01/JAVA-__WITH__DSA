import java.util.Arrays;

public class Solution853 {
       public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        double[][] carData = new double[n][2];

        // i have take position on 0th 
        // i have take time on 1st

        for(int i=0;i<n;i++){
          carData[i][0] = position[i];
          carData[i][1] =(target-position[i])/speed[i];
        } 
        
        Arrays.sort(carData ,(a,b) ->Double.compare(a[0],b[0]));
        int res=1;
        double tt = carData[n-1][1];
        for(int i= n-2; i>=0; i--){
            if(carData[i][1]>tt){
                res++;
                tt = carData[i][1];
            }
        }
return res;


    }
    public static void main(String[] args) {
        int position[] = { 0, 2, 4};
        int target =100;
        int speed[] = {4,2,1};

        System.out.println(carFleet(target, position, speed));
    }
}
