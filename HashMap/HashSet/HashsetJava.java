package HashSet;

import java.util.HashSet;

/**
 * HashsetJava
 */
public class HashsetJava {

    public static void main(String[] args){
        HashSet<String> set=new HashSet<>();
        // for adding
        set.add("Monu");
        set.add("hello");
        set.add("hello");

        //print the set
        System.out.println(set);

        // removing in hashset

        // set.remove("hello");

        // System.out.println(set);

        // checking the value in hashset

        System.out.println(set.contains("Monu"));

        for(String s: set){
            System.out.println(s);
        }


    }

}