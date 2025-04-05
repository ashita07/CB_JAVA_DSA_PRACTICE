import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String> ll=new ArrayList<>();
        print(n,0,0,"",ll);
        System.out.println(ll);
    }

    public static void print(int n,int open,int close,String ans,List<String> ll) {

        if(open==n && close==n){
           ll.add(ans);
            return;
        }
        if(open>n ||close>open)
            return;
        print(n,open+1,close,ans+"(",ll);
        print(n,open,close+1,ans+")",ll);

    }
}
