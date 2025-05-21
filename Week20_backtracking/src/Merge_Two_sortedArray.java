import java.util.Arrays;

public class Merge_Two_sortedArray {
    public static void main(String[] args) {
        int[] arr1={2,3,5,7,8};
        int[] arr2={1,3,5,8,9,11,13};
        System.out.println(Merge(arr1,arr2));
    }

    public static String Merge(int[] arr1,int[] arr2) {
        int n=arr1.length,m=arr2.length;
        int[] arr=new int[n+m];
        int j=0,i=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                k++;
                i++;
            }else{
                arr[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            arr[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            arr[k]=arr2[j];
            k++;
            j++;
        }
        return Arrays.toString(arr);
    }
}
