import java.util.ArrayList;
import java.util.List;

public class StringPallindromePartition {
    public static void main(String[] args) {
        String ques="nitin";
        List<List<String>> ll1=new ArrayList<>();
        List<String> ll=new ArrayList<>();
        Partition(ques,ll,ll1);
        System.out.println(ll1);
}
    private static void Partition(String ques,List<String> ll,  List<List<String>> ll1) {
        if(ques.length()==0){
           ll1.add(new ArrayList<>(ll));
            return;
        }
        for(int cut=1;cut<=ques.length();cut++){
           String sq=ques.substring(0,cut);
           if(isPallindrome(sq)) {
               ll.add(sq);
               Partition(ques.substring(cut), ll,ll1);
               ll.removeLast();
           }
        }

    }

    private static boolean isPallindrome(String sq) {
//        String original = sq;
//        String reversed = new StringBuilder(original).reverse().toString();
//        if(original.equals(reversed))
//        return true;
//        else{
//            return false;
//        }
        int i=0;int j=sq.length()-1;
        while(i<j){
            if(sq.charAt(i)!=sq.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }
}
