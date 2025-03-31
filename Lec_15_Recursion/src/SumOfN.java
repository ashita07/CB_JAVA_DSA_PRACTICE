public class SumOfN {
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfNo(n));
    }
    public static int sumOfNo(int n){
        if(n==1)
            return 1;
       int sum=n+sumOfNo(n-1);
       return sum;
    }
}
