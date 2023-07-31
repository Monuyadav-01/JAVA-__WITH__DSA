public class LeetCodePr1711 {

    public static boolean power(int n) {
        if (n == 0) {
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }

    public static int countPairs(int[] deliciousness) {
        int count=0;
        for(int i=0; i<deliciousness.length-1;i++){
            for(int j=1; j<deliciousness.length-1;j++){
                if(power(deliciousness[i]+deliciousness[j])){
                    count++;
                }
                
            }
        
        }
        return count;
    }

    public static void main(String[] args) {
      int deliciousness[]={1,1,1,3,3,3,7};
      int ans=countPairs(deliciousness);
      System.out.println(ans);
    }
}
