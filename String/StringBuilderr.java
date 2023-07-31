/**
 * StringBuilderr
 */
public class StringBuilderr {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb);
        sb.setCharAt(0, 'd');
        System.out.println(sb );
    }
}