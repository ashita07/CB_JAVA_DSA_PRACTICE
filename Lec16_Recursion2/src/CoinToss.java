public class CoinToss {
    public static void main(String[] args) {
        int n=4;
        toss("",n);
    }
    public static void toss(String s,int n){

        if(n==0 ){
            System.out.println(s);
            return;
        }
        if(s.length()==0 || s.charAt(s.length()-1)!='H') {
            toss(s + "H", n - 1);
        }
            toss(s + "T", n - 1);


    }
}
