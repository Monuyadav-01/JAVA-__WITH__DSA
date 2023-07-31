public class BS2 {

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

    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 3, 4};
        int first=first(arr, 4);
        System.out.println(first);
        // int last=last(arr, 10);
        // System.out.println(last);
    }
}

