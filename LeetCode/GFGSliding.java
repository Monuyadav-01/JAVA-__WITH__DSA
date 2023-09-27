import java.util.HashMap;

public class GFGSliding {

    static int search(String pat, String txt) {
        // code here
        // int n = pat.length();
        // int m = txt.length();
        // HashMap<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < n; i++) {
        //     char ch = pat.charAt(i);
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }
        // int i = 0;
        // int j = 0;
        // int cnt = map.size();
        // int res = 0;

        // while (j < m) {
        //     char ch = txt.charAt(j);
        //     if (map.containsKey(ch)) {
        //         int cur = map.get(ch);
        //         if (cur == 1) {
        //             cnt--;
        //             map.put(ch, cur - 1);
        //         } else {
        //             map.put(ch, cur - 1);
        //         }
        //     }
        //     if (j - 1 + 1 < n) {
        //         j++;
        //     } else if (j - i + 1 == n) {
        //         if (cnt == 0)
        //             res++;
        //         if (map.containsKey(txt.charAt(i))) {
        //             int cur = map.get(txt.charAt(i));
        //             if (cur == 0) {
        //                 cnt++;
        //                 map.put(txt.charAt(i), cur + 1);
        //             } else 
        //                 map.put(txt.charAt(i), cur + 1);
                    
        //         }
        //         i++;
        //         j++;

        //     }
        // }
        // return res;

        // code here
        int m = pat.length(), n = txt.length();
        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < m; i++) {
            char ch = pat.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        int i = 0, j = 0, count = freq.size(), res = 0;

        while (j < n) {
            char ch = txt.charAt(j);
            if (freq.containsKey(ch)) {
                int curr = freq.get(ch);
                if (curr == 1) {
                    count--;
                    freq.put(ch, curr - 1);
                } else
                    freq.put(ch, curr - 1);
            }

            if (j - i + 1 < m)
                j++;

            else if (j - i + 1 == m) {
                if (count == 0)
                    res++;

                if (freq.containsKey(txt.charAt(i))) {
                    int curr = freq.get(txt.charAt(i));
                    if (curr == 0) {
                        count++;
                        freq.put(txt.charAt(i), curr + 1);
                    } else
                        freq.put(txt.charAt(i), curr + 1);
                }
                i++;
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String pt ="for";
        String txt = "forxxorfxdofr";
        System.out.println(search(pt, txt));
    }
}
