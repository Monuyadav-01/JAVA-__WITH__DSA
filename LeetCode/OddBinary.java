

public class OddBinary {

    public static String maximumOddBinaryNumber(String s) {
       int n = s.length();
       int cnt =0;
       for(int i=0;i<n;i++){
        char c =s.charAt(i);
        if(c=='1'){
            cnt++;
        }
       }
       s="";
       for(int i =1;i<cnt;i++){
        s+="1";
       }
       for(int i =cnt; i<n;i++){
        s+='0';
       }
       s+='1';
       return s;
    }

    public static void main(String[] args) {
        String s = "010";
        System.out.println(maximumOddBinaryNumber(s));
    }
}
