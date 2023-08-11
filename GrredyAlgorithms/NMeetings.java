import java.util.ArrayList;
import java.util.Collections;

import java.util.*;

/**
 * NMeetings
 */
public class NMeetings {

      static boolean cmp(Pair<Integer, Integer> a, Pair<Integer, Integer> b) {
        return a.getValue() < b.getValue();
    }
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        ArrayList<Pair<Integer, Integer>> v=new ArrayList<>();
        
        for(int i=0; i<n ;i++){
            Packer<Integer, Integer> p=new Pair<>(start[i], end[i]);
            v.add(p);
        }
          Collections.sort(v, Main::cmp);
          int count = 1;
        int ansEnd = v.get(0).getValue();
          for(int i=1; i<n ;i++){
              if (v.get(i).getKey() > ansEnd) {
                count++;
                ansEnd = v.get(i).getValue();
            }
          }
          return count;
    }

    public static void main(String[] args) {

    }
}