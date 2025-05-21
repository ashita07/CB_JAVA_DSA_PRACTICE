import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] arr={4,5,2,10};
        int [] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty() && arr[st.peek()] <arr[i]){
                ans[st.pop()]=arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" "+ans[i]);
        }
    }
}
