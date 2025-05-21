import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Letter_Combination_of_a_PhoneNumber {
    static String[] key = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    public static void main(String[] args) {
       String str="23";
        List<String> ll=new ArrayList<>();
       String_Combination(str,"",ll);
        System.out.println(ll);
    }
    public static void String_Combination(String ques,String ans,List<String> ll){

        if(ques.isEmpty()) {
            ll.add(ans);
            return;
        }
        char ch=ques.charAt(0);
        String press=key[ch-48];
        for(int i=0;i<press.length();i++){
            String_Combination(ques.substring(1),ans+press.charAt(i),ll);
        }
    }

}
