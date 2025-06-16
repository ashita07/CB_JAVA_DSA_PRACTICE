public class Addition {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(2,7,9));
        System.out.println(add(4,53,3,232,43,34,3));
    }
    public static int add(int a,int b) {


        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static int add(int x,int ...a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
