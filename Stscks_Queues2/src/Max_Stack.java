import java.util.Stack;

public class Max_Stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(53);
        st.push(87);
        st.push(32);
        System.out.println(st);
        Stack<Integer> st1=new Stack<>();
        int max=0;
        int n=st.size();
        for(int i=1;i<=n;i++){
            max=Math.max(st.peek(),max);

            st1.push(st.peek());
            st.pop();
        }
        for(int i=1;i<=n;i++){
       if(st1.peek()!=max){
           st.push(st1.peek());
           st1.pop();
       }
        }
        st.push(max);
        System.out.println(st);
    }
}
