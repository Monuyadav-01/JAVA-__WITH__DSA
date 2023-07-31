public class PalandromicString {
    
    public static boolean plandromic(String s){
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return plandromic(s.substring(1, s.length()-1));
        }
        else {
            return false;
        }
        

    }
    public static void main(String[] args) {
        String s="aaaab";
        boolean ans=plandromic(s);
        System.out.println(ans);
    }
}
