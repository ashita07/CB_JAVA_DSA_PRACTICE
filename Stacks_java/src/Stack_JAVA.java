import java.util.Stack;
import java.util.Vector;

public class Stack_JAVA {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
       st.push(10);
       st.push(23);
       st.push(79);
        st.push(3423);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        for(int v:st){
            System.out.println(v+" ");
        }
    }
}
