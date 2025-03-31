public class Main {
    public static void main(String[] args) {
        int a=10;
        Integer a1=10;
        long g=10;
        Long d=12l;
        System.out.println(g+" "+d);

        //auto boxing
        int b=90;
        Integer  r=123;
        r=b;
//        /unboxing
        String s=new String("a");
        String f=new String("a");
        System.out.println(s==f);
    }
}