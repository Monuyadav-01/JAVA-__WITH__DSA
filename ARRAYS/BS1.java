import java.util.ArrayList;

public class BS1 {
    public static int first(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        int res=-1;

        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                res=mid;
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return res;
    }
    public static int last(int arr[], int target){
         int start=0;
        int end=arr.length-1;
        int res=-1;

        while(start<=end){
            int mid=start+((end-start)/2);
            if(arr[mid]==target){
                res=mid;
                start=mid+1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return res;
    }
    public static int[] searchRange(int[] nums, int target){
        ArrayList<Integer> arr=new ArrayList<>();
        int first=first(nums, target);
        int last=last(nums, target);
        arr.add(first);
        arr.add(last);

        int res[]=new int[arr.size()];
        for(int i=0; i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,10,10,10,18,20};
       int res[]= searchRange(arr, 10);
        for(int i=0; i<res.length;i++){
            System.out.println(arr[i]);

        }


    }

}
