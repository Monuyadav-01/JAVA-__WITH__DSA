import java.util.HashMap;
import java.util.HashSet;

/**
 * QUE2
 */

public class QUE2 {

    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> m = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (m.containsKey(c)) {
                m.put(c, m.get(c) - 1);
                if (m.get(c) < 0) {
                    return c;
                }
            } else {
                return c;
            }
        }

        return t.charAt(t.length() - 1);
        
    }
public static void main(String[] args) {
    String s="a";
    String t="aa";

    System.out.println(findTheDifference(s, t));
}
    
}