import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.size());
    }
}
