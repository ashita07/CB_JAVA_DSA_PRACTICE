import java.util.Arrays;

public class Partition_Array {
    public static void main(String[] args) {
        int [] board={5,7,2,3,8,1,4,10,2,1,20,7,12,13,10};
        partition(board,0,board.length-1);
    }
    public static void partition(int[] arr,int si,int ei){

        int idx=ei;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[idx]){
                int temp=arr[i];
                arr[i]=arr[si];
                arr[si]=temp;
                si++;
            }
        }
        int temp=arr[si];
        arr[si]=arr[idx];
        arr[idx]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
