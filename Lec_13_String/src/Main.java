public class Main {
    public static void main(String[] args) {
        String s1="HELLO";
        String s2=new String("HELLO");

        System.out.println(equal(s1,s2));
    }

    public static boolean equal(String s1,String s2) {
        if(s1==s2)
            return true;
        if(s1.length()!=s2.length())
            return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }
        return true;
    }
}