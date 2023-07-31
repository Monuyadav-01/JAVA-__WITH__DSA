import java.util.ArrayList;

/**
 * GFG
 */
public class GFG {

     public static int largest(int sizeOfArray, int arr[]){
        int largest=-1;
        for(int i=0;i<sizeOfArray;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
        
    }

    public static int slargest(int sizeOfArray, int arr[]){
       if(sizeOfArray<2)
	return -1;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < sizeOfArray; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
	return second_large;

}
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        ArrayList <Integer>ans=new ArrayList<>();
         int largest=largest(sizeOfArray, arr);
        int small=slargest(  sizeOfArray, arr);

        ans.add(largest);
        ans.add(small);
        return ans;


        
        
    }
    public static void main(String[] args) {
         int arr[] = {2,1,2};

         ArrayList<Integer> ans=largestAndSecondLargest(arr.length, arr);

         for(int i=0; i<ans.size();i++){
            System.out.println(ans.get(i));
         }
    }
}