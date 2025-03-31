public class IsSorted {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,8};
        System.out.println(sorted(arr,1));
    }
    public static boolean sorted(int[] arr,int i){
        if(i==arr.length)
            return true;
        if(arr[i-1]>arr[i])
            return false;

      return  sorted(arr,i+1);
    }
}
