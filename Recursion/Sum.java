public class Sum {
    // public static  void sum(int i, int sum){
    //     if(i<1){
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum(i-1, sum+i);

    // }

    public static int sumOfN(int n){
        
        if(n==0){
            return 0;
        }
    int sum=  n+ sumOfN(n-1);
       
        return sum;
    }
    public static void main(String[] args) {
        // int i=3;
        // int sum=0;
        // sum(i, sum);
        int ans=sumOfN(3);
        System.out.println(ans);

    }
}
