public class Find_Occurance {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7};
        int n=arr.length;
        int item=6;
        System.out.println(Index(item,0,n,arr));
    }
    public static int Index(int item,int index,int n,int[] arr){
        if(index==n){
            return -1;
        }
        if(arr[index]==item){
            return index;
        }
        return Index(item,index+1,n,arr);
    }
}
