public class Fibbo_Recursion {
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    public static int fib(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int fn=fib(n-1)+fib(n-2);
        return fn;
    }
}
