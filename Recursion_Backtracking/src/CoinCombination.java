import java.util.ArrayList;
import java.util.List;

public class CoinCombination {
    public static void main(String[] args) {
        int [] arr={2,3,4,5};
        List<Integer> ll=new ArrayList<>();
        List< List<Integer>> ll1=new ArrayList<>();
        permutation(arr,8,0,ll,0,ll1);
        System.out.println(ll1);
    }

    public static void permutation(int[] coin,int total,int sum,List<Integer> ll,int idx,List< List<Integer>> ll1) {
        if(sum==total){
             ll1.add(new ArrayList<>(ll));
            return;
        }
        if(sum>total)
            return;
        for(int i=idx;i<coin.length;i++) {
            ll.add(coin[i]);
            permutation(coin,total, sum+coin[i], ll,i,ll1);
           ll.removeLast();
        }
    }
}
