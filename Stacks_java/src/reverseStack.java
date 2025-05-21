import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(12);
        st.push(142);
        st.push(2321);
        st.push(12);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }
    private static void Reverse(Stack<Integer> st){
       if(st.isEmpty()){

           return;
       }
       int x=st.pop();
       Reverse(st);
        addLast(st,x);
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
