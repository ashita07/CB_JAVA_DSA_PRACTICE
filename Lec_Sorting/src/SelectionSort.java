import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4,-1,5,3,1,2};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int idx=Minimum_index(arr,i);
            int temp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }

    public static int Minimum_index(int[] arr,int idx) {
        int min=idx;
    for(int i=idx+1;i<arr.length;i++){
        if(arr[i]<arr[min]){
            min=i;
        }
    }
    return min;
    }
}
