

public class Solution2496 {

    public static int maximumValue(String[] strs) {
        int max=0;
        for(String i : strs ){
            max  = Math.max(max, length(i));
        }
        return max;
    }
    public static int length(String s){
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) >='a' && s.charAt(i)<='z'){
                return n;
            }
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        String []strs =  {"alic3","bob","3","4","00000"};

        System.out.println(maximumValue(strs));
    }
}
