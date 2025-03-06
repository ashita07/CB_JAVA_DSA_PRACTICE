import java.util.Arrays;
import java.util.Scanner;

public class BuyRoses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        while (t > 0) {
            int n = sc.nextInt();  // Number of roses
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int target = sc.nextInt(); // Money Deepak has

            Arrays.sort(arr); // Sort the array

            int i = 0, j = n - 1;
            int bestI = 0, bestJ = 0;
            int minDiff = Integer.MAX_VALUE;

            while (i < j) {
                int sum = arr[i] + arr[j];

                if (sum == target) {
                    int diff = arr[j] - arr[i];

                    if (diff < minDiff) {
                        minDiff = diff;
                        bestI = arr[i];
                        bestJ = arr[j];
                    }
                    i++; // Move to the next possible pair
                    j--;
                } else if (sum > target) {
                    j--;
                } else {
                    i++;
                }
            }

            System.out.println("Deepak should buy roses whose prices are " + bestI + " and " + bestJ + ".");
            System.out.println(); // Blank line after each test case
            t--;
        }
        sc.close();
    }
}
