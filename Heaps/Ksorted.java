import java.util.*;
public class Ksorted {
    public static ArrayList<Integer> fun(int nums[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i =0;i<nums.length ; i++){

            if(pq.size()>k){
                ans.add(pq.peek());
                pq.poll();
            }
            pq.add(nums[i]);
        }
        if(!pq.isEmpty()){
            while(!pq.isEmpty()){
                ans.add(pq.poll());
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {6,5,3,2,8,10,9};
        ArrayList<Integer> ans = fun(nums, 3);
        for(int i : ans){
            System.out.println(i);
        }
    }
}
