public class Print_Subsequence {
    public static void main(String[] args) {
        String s="abc";
        print(s,"");
    }
    public static void print(String ques,String ans){
        if(ques.isEmpty()){
            System.out.println(ans+" ");
            return;
        }

        char ch=ques.charAt(0);
        print(ques.substring(1),ans);
        print(ques.substring(1),ans+ch);
    }

}
