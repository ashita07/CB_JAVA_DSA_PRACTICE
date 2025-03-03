public class Kth_root {
    public static void main(String[] args) {
        int n=217;
        int k=3;
        System.out.println(Root(n,k));
    }

    public static int Root(int n,int k) {
        int lo=0;
        int hi=n;
        int ans=0;
        while(lo<=hi)
        {
            int mid=(hi+lo)/2;
            if(Math.pow(mid,k)<=n){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
    }
     return ans;
}
}
