public class Binary_Search {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7,8,9,13,16,18,19,20,21};
        int item=20;
        System.out.println(Search(item,arr));
    }

    public static int Search(int item,int[] arr) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==item)
                return mid;
            else if(arr[mid]>item)
                hi=mid-1;
            else
                lo=mid+1;
        }
        return -1;
    }
}
