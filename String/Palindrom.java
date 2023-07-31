/**
 * Palindrom
 */
public class Palindrom {

    public static void palindromsubString(String str) {

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (isPalindrom(ss)==true) {
                    System.out.println(ss);
                }
            }
        }
    }

    private static boolean isPalindrom(String ss) {
        int i = 0;
        int j = ss.length() - 1;

        while (i <= j) {
            char ch = ss.charAt(0);
            char ch1 = ss.charAt(j);

            if (ch != ch1) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str="abccbc";
        palindromsubString(str);
    }
}