import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "the    sky    is pink";
        s1 = s1.trim();
        String[] s = s1.split(" +");
        System.out.println(Arrays.toString(s));

        String ans = "";
        for (int i = s.length-1;i>=0;i--){
            ans=ans+s[i]+" ";
        }
        System.out.println(ans.trim());
    }
}
