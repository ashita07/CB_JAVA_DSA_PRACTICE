import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Number {
    public static void main(String[] args) {
        int n = 100;
        List<Integer> ll=new ArrayList<>();
        Lexicographical(0,n,ll);
        System.out.println(ll);
    }
    public static void Lexicographical(int curr,int n,List<Integer> ll){

        if(curr>n)
            return;
        int i=0;
        if(curr==0){
            i=1;
        }
       ll.add(curr);
        for(;i<=9;i++){
            Lexicographical(curr*10+i,n,ll);
        }
        }
}
