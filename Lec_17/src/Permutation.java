public class Permutation {
    public static void main(String[] args) {
        String str="abca";
  Print(str,"");
    }
    public static void Print(String str,String ans)
    {

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String s1=str.substring(0,i);
            String s2=str.substring(i+1);
            Print(s1+s2,ans+ch);
        }
    }}
