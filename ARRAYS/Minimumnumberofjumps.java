public class Minimumnumberofjumps {
    public static int minJumps(int[] arr){
          int i=0;
        int ans=0;
        int n=arr.length;
        while(i<n-1){
            if(arr[i]==0){
                break;
            }
            ans++;
            i=i+arr[i];
            
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={2, 3, 1 ,1 ,2 ,4, 2, 0 ,1, 1} ;
        int ans=minJumps(arr);
        System.out.println(ans);
    }
}
