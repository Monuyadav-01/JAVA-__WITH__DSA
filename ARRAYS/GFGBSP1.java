import java.util.ArrayList;
import java.util.Collections;

public class GFGBSP1 {
       public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=0; i<n;i++){
            arrayList.add(arr1[i]);
          
        }
        for(int i=0;i<m;i++){
              arrayList.add(arr2[i]);
        }
        Collections.sort(arrayList);

        int res[]=new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            res[i]=arrayList.get(i);
        }
    
        int low=0;
        int high=res.length-1;


        while(low<=high){
            int mid=(low+high)/2;
            if(mid==k){
                return res[mid];
            }
            if(mid<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;



    }
    public static void main(String[] args) {
        int arr1[]={2, 3, 6, 7, 9};
        int arr2[]={1, 4, 8, 10};   
        long ans=kthElement(arr1, arr2, arr1.length, arr2.length, 4);
        System.out.println(ans);
      
    }
}
