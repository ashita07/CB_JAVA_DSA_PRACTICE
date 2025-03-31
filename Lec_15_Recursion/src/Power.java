public class Power {
    public static void main(String[] args) {
        int a=3;
        int n=4;
        System.out.println(Pow(a,n));
    }
    public static int Pow(int a ,int n){
        if(n==1){
            return a;
        }
        int p=a*Pow(a,n-1);
        return p;
    }

}
