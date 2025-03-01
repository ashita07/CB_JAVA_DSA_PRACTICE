import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums={1,5,4,3,2};
        for(int i=1;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }        System.out.println(Arrays.toString(nums));
    }
}