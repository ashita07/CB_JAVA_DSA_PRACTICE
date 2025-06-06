import java.util.Stack;

public class Largest_Histogram {
    public static void main(String[] args) {
int[] arr={2,1,5,6,2,3};
        int a =histogram(arr);
        System.out.println(a);
    }
    public static int histogram(int[] arr){
        Stack<Integer> st=new Stack<>();
        int area=0;
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()] >arr[i]){
                int h=arr[st.pop()];
                int r=i;
                if(!st.isEmpty()){
                    int l=st.peek();
                    area=Math.max(area,h*(r-l-1));

                }else{
                    area=Math.max(area,h*r);
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];
            if(!st.isEmpty()){
                int l=st.peek();
                area=Math.max(area,h*(r-l-1));

            }else{
                area=Math.max(area,h*r);
            }
        }
        return area;
    }

}
