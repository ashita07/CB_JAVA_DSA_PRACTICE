import java.util.Scanner;

public class CalculateTheSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        int[] arr2=new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr[i];
        }

        while(t>0){
            int a= sc.nextInt();
            for(int i=0;i<arr.length;i++){
                if(i-a<0){
                    arr2[i]=arr2[i]+arr[i-a+n];
                }else{
                    arr2[i]=arr2[i]+arr[i-a];
                }

            }
            for (int j = 0; j < n; j++) {
                arr[j] = arr2[j];
            }
            --t;
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr2[i];
        }
        System.out.println(sum);
    }
}
