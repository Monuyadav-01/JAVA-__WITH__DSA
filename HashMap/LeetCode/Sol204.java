package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class Sol204 {

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> m = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++) {
            if (!m.containsKey(s.charAt(i)) && !m.containsValue(t.charAt(i))) {
                m.put(s.charAt(i), t.charAt(i));
            } else if (m.containsKey(s.charAt(i)) && m.get(s.charAt(i)) == t.charAt(i)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        String t = "xxy";
        System.out.println(isIsomorphic(s, t));
    }
}
