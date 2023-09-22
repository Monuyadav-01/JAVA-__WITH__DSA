/**
 * Solution6
 */
public class Solution6 {
  public static String convert(String s, int r) {
        int n= s.length();
        if(r == 1 || n <=r) return s;

        StringBuilder sb =new StringBuilder();
        int cycle =2*r-2;


        for(int i=0; i<r; i++){
          for(int j =0; i+j <n; j=j+cycle){
            sb.append(s.charAt(i+j));

            if( i !=0 && i!=r-1 && j+cycle-i < n){
              sb.append(s.charAt(j+cycle-i));
            }
          }

        }
      return  sb.toString();

    }
    public static void main(String[] args) {
       String s= "PAYPALISHIRING";
       int r= 3;
       System.out.println(convert(s, r));
    }
}