public class BoardPath {
    public static void main(String[] args) {
        int end=3;
        path(0,3,"");
    }
    public static void path(int curr,int end,String ans){
        if(curr>end)
            return;
        if(curr==end){
            System.out.println(ans);
            return;
        }
        for(int i=1;i<=end;i++){
            path(curr+i,end,ans+i);
        }


    }
}
