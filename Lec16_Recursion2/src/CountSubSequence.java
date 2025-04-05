public class CountSubSequence {
    public static void main(String[] args) {
        String s="abc";
        int c=0;
       int a= print(s,"",c);
        System.out.println("\n"+a);
    }
   ;
    public static int print(String ques,String ans,int c){
        if(ques.isEmpty()){
            System.out.print(ans+" ");

            return 1;
        }

        char ch=ques.charAt(0);
       int x= print(ques.substring(1),ans,c);
       int y= print(ques.substring(1),ans+ch,c);
        return x+y;
    }
}
