public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr={5,4,-1,-12,7,8};
        System.out.println(SubbArray_Sum(arr));
    }

    public static int SubbArray_Sum(int[] arr) {
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
                sum+=arr[i];
                ans=Math.max(ans,sum);
                if(sum<0)
                    sum=0;
        }
        return ans;
    }
}
