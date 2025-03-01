import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
int[] arr={2,3,10,5,6,7,8,9,7};
 Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Sort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            InsertElement(arr,i);
        }
    }

    public static void InsertElement(int[] arr,int i) {
     int item=arr[i];
     int j=i-1;
     while(j>=0 && arr[j]>item){
        arr[j+1]=arr[j];
        arr[j]=item;
        j--;
     }
    }
}
