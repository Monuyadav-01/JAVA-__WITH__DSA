import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
        public static List<List<Integer>> combinationSum(int[] candidates, int target) { 
         List<List<Integer>> ans=new ArrayList<>();
         int index=0;
         int currsum=0;
         List<Integer> temp=new ArrayList<>();
            solve(ans, index, candidates,currsum ,target, temp);
            return ans;
    }
   
    private static void solve(List<List<Integer>> ans, int index, int candidates[],int currsum, int target, List<Integer> temp) {
        if(currsum>target){
            return;
        }
       if(index==candidates.length){
        if(currsum==target){
            ans.add(temp);
        }
       }
        // include

        currsum+=candidates[index];
        temp.add(candidates[index]);
        solve(ans, index+1, candidates, currsum, target, temp);
        temp.remove(temp.size()-1);
       // exclude

       solve(ans, index+1, candidates, currsum, target, temp);
        }

    public static void main(String[] args) {
        int candidates[]={2,3,6,7};
        List<List<Integer>>ans =combinationSum(candidates, 7);
        for(int i=0; i<ans.size();i++){
            for(int j=i;j<ans.size();j++){
                System.out.print(ans.get(i));
            }
        }
    }
}
