import java.util.Arrays;

public class Solution881 {
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n= people.length;
        int ans=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            int left =limit-people[j];

            if(people[i]<=left){
                ans++;
                i++;
                j--;
            }
            else{
                ans++;
                j--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int people[] = {1,2,2,3};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }
}
