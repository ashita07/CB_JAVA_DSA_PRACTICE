public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(Search(arr,target));
    }

    public static int Search(int[] arr,int target) {
        int hi=arr.length-1;
        int lo=0;
        while(lo<=hi){
            int mid= lo + (hi - lo) / 2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>=arr[lo]){

                if(arr[lo]<=target && arr[mid]>target){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }

            }else{
                if(arr[mid]<target && arr[hi]>=target){
                    lo=mid+1;
                }else{
                    hi=mid-1;
                }
            }
        }
        return -1;
    }
}
