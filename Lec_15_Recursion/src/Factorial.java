public class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(fac(n));
    }
    public static int fac(int n){
        if(n==0)
            return 1;
        int fn=fac(n-1); //smaller problem
        return fn*n; //smaller problem +self work
    }
}
