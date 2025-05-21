import java.util.Stack;

public class Add_Last_in_Stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(12);
        st.push(142);
        st.push(2321);
        st.push(12);
        System.out.println(st);
        addLast(st,7);
        System.out.println(st);
    }
    private static void addLast(Stack<Integer> st,int item){
        if(st.isEmpty())
        {
            st.push(item);
            return;
        }
        int x=st.pop();
        addLast(st,item);
        st.push(x);
    }
}
