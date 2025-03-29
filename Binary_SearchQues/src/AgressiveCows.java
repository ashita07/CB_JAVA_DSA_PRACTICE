import java.util.Arrays;

public class AgressiveCows {
    public static void main(String[] args) {
        int []stall={1,10,11,12,13};
        int noc=3;
        Arrays.sort(stall);
        System.out.println(largest_min(stall,noc));
    }
    public static int largest_min(int []arr,int noc){
        int hi=arr[arr.length-1]-arr[0];
        int lo=0;
        int ans=0;
        while(lo<=hi){
            int mid=hi-(hi-lo)/2;
            if(isItPossible(arr, noc, mid)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int []stall,int noc,int mid) {
        int pos=stall[0];
        int cow=1;
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
           if(cow==noc){
               return true;
           }
        }
        return false;
    }
}
