package LeetCode;

import java.util.HashMap;

public class Sol242 {

    static HashMap<Character, Integer> helper(String str){
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }
            else{
                int currFreq=map.get(str.charAt(i));
                map.put(str.charAt(i), currFreq+1);
            }
        }
        return map;
    }
    public static boolean isAnagram(String s, String t) {
       if(s.length() !=t.length()) {
        return false;
       }
       HashMap<Character, Integer>mp1 =helper(s);
       HashMap<Character, Integer>mp2 =helper(t);
       return (mp1.equals(mp2));

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
