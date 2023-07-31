package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class Sol1111 {
    public static int[] maxDepthAfterSplit(String seq) {
        Stack<Character> st=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        int ans[]=new int[seq.length()];
        for(int i=0; i<seq.length();i++){
          char ch=seq.charAt(i);
          if(!st.isEmpty()){
             if(st.peek()=='(' && ch=='('){
            st.push(ch);
            arr.add(arr.get(arr.size()-1)+1);
          }
          else if(st.peek()=='(' && ch==')'){
            st.pop();
            arr.add(arr.get(arr.size()-1));
          }
         
         if(st.isEmpty()){
            st.push(ch);
            arr.add(0);
          }

        }
       
    }
     for(int i=0; i<arr.size() ;i++){
          ans[i]=arr.get(i);
        }
        return ans;
}

    public static void main(String[] args) {
        String seq = "(()())";

        int ans[] = maxDepthAfterSplit(seq);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

