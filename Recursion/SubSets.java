import java.util.ArrayList;
import java.util.List;



class SubSets {
    private static void solve(int nums[], List<Integer> output, int index, List<List<Integer>> ans) {
        if (index >= nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        solve(nums, output, index + 1, ans);

        int element = nums[index];
        output.add(element);
        solve(nums, output, index + 1, ans);
        output.remove(output.size() - 1);
    }

    public static List<List<Integer>> subsets(int [] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};

        List<List<Integer>> ans=subsets(nums);

        for(int i=0; i<ans.size();i++){
            for(int j=0;j<ans.size();j++)
            {
            System.out.println(ans.get(i));
            }
        }
    }
}

