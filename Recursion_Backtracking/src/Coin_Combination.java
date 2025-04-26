public class Coin_Combination {
    public static void main(String[] args) {
        int [] arr={2,3,4,5};
        permutation(arr,10,0,"",0);
    }

    public static void permutation(int[] coin,int total,int sum,String ans,int idx) {
        if(sum==total){
            System.out.println(ans);
            return;
        }
        if(sum>total)
            return;
        for(int i=idx;i<coin.length;i++) {
            permutation(coin,total, sum+coin[i], ans + coin[i],i);
        }
    }
}
